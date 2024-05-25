package Servidor;

import Models.Usuario;
import View.TelaLogado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente implements Runnable {

    private Socket socket;
    private BufferedReader leitor;
    private PrintWriter escritor;
    private boolean acabado;
    private TelaLogado chat;
    private Usuario usuario;

    public Cliente(TelaLogado chat, Usuario usuario) throws IOException {
        this.socket = new Socket("127.0.0.1", 8089);
        this.chat = chat;
        this.usuario = usuario;
    }

    public Cliente() {
    }

    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() {
        try {
            socket = new Socket("127.0.0.1", 8089);
            escritor = new PrintWriter(socket.getOutputStream(), true);
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
    }

    ;
    
    public void enviarMensagem(String mensagem) {

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(new Mensagem(mensagem, this.usuario));
            outputStream.flush();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void encerrar() {
        try {
            leitor.close();
            escritor.close();
            if (!socket.isClosed()) {
                socket.close();
            }
        } catch (IOException e) {

        }
    }

    class ManipuladorDeEntrada implements Runnable {

        @Override
        public void run() {
            try {
                BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
                while (!acabado) {
                    String mensagem = leitura.readLine();
                    if (mensagem.equalsIgnoreCase("Sair")) {
                        escritor.println(mensagem);
                        leitura.close();
                        encerrar();
                    } else {
                        escritor.println(mensagem);
                        chat.setChat(mensagem);
                    }
                }
            } catch (IOException e) {
                encerrar();
            }
        }
    }
}
