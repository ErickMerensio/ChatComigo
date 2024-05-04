package Servidor;

import View.TelaLogado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Cliente implements Runnable{

    private Socket socket;
    private BufferedReader leitor;
    private PrintWriter escritor;
    private boolean acabado;
    private TelaLogado chat;
   
    public Cliente(TelaLogado chat) throws IOException {
        this.socket = new Socket("127.0.0.1",8089);
        this.chat = chat;
    }
    
    public Cliente() {
    }
    

    @Override
    public void run() {
        try {
             socket = new Socket("127.0.0.1",8089);
             escritor = new PrintWriter(socket.getOutputStream(),true);
             leitor = new BufferedReader(new InputStreamReader(socket.getInputStream()));

             ManipuladorDeEntrada manipuladorDeEntrada = new ManipuladorDeEntrada();
             Thread thread = new Thread(manipuladorDeEntrada);
             thread.start();

             String mensagem;
             while ((mensagem = leitor.readLine()) != null) {
                 System.out.println(mensagem);
             }
        } catch (Exception e) {
            encerrar();
        }
    };
    
    public void enviarMensagem(String mensagem) {
        
        try {
            escritor = new PrintWriter(this.socket.getOutputStream(),true);
            escritor.println(mensagem + "\n");
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public  void encerrar () {
        try {
            leitor.close();
            escritor.close();
            if(!socket.isClosed()) {
                socket.close();
            }
       }catch (IOException e) {

        }
    }

    class ManipuladorDeEntrada implements Runnable {
        
        TelaLogado tela = new TelaLogado();

        @Override
        public void run() {
            try {
                BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
                while (!acabado) {
                   String message = leitura.readLine();
                    if(message.equalsIgnoreCase("Sair")) {
                        escritor.println(message);
                      leitura.close();
                        encerrar();
                   } else {
                        escritor.println(message);
                        tela.setChat(message);
                   }
               }
            } catch (IOException e) {
               encerrar();
            }
        }
    }

      public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.run();
    }

}