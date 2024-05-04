package Servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Servidor implements Runnable{

    public Servidor() {
        escritores = new ArrayList<>();
        acabado = false;
    }

    private ArrayList<ServidorHandler> escritores;
    private ServerSocket servidor;
    private boolean acabado;
    private ExecutorService pool;
    
    @Override
    public void run() {
        try {
            servidor = new ServerSocket(8089);
            pool = Executors.newCachedThreadPool();
            System.out.println("Você conectou-se a porta 8089");
            while(!acabado) {
                Socket cliente = servidor.accept();
                ServidorHandler servidorHandler = new ServidorHandler(cliente);
                escritores.add(servidorHandler);
                pool.execute(servidorHandler);
            }
        } catch (Exception e) {
            encerrar();
        }
    }
    public void transmissao(String mensagem) {
        for(ServidorHandler sh : escritores) {
            if (sh != null) {
              sh.transmitir(mensagem);  
            }
        }
    }

    public void encerrar() {
        try {
            acabado = true;
            pool.shutdown();
            if (!servidor.isClosed()) {
                servidor.close();
            }
            for(ServidorHandler sh : escritores) {
                sh.encerrar();
            }
        } catch (IOException e) {
            encerrar();
        }
    }
    class ServidorHandler implements  Runnable {

        private Socket cliente;
        private BufferedReader leitor;
        private PrintWriter escritor;
        private String nome;

        public ServidorHandler(Socket cliente) {
            this.cliente = cliente;
        }

        @Override
        public void run() {

            try {
                escritor = new PrintWriter(cliente.getOutputStream(),true);
                leitor = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
              //escritor.println("Escreva seu nome: ");
                nome = leitor.readLine();
                System.out.println(nome + " conectou-se ao chat!");
                transmissao(nome + " entrou no chat!");
                String mensagem;

                while((mensagem = leitor.readLine()) != null) {
                    if (mensagem.equalsIgnoreCase("Sair")) {
                        transmissao(nome + " saiu do chat!");
                        encerrar();
                    }
                   transmissao(nome + ": " + mensagem);
                }
            }catch (IOException e) {

            }

        }

        public void transmitir(String mensagem) {
            escritor.println(mensagem);
        }

        public void encerrar() {
            try {
                escritor.close();
                leitor.close();
                if (!cliente.isClosed()) {
                    cliente.close();
                }
            } catch (IOException e) {

            }
        }
    }

    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        servidor.run();
    }
}
