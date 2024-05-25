package Servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor implements Runnable {

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
            while (!acabado) {
                Socket cliente = servidor.accept();
                ServidorHandler servidorHandler = new ServidorHandler(cliente);
                escritores.add(servidorHandler);
                pool.execute(servidorHandler);
            }
        } catch (Exception e) {
            encerrar();
        }
    }

    public void transmissao(String mensagem) throws IOException {
        for (ServidorHandler sh : escritores) {
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
            for (ServidorHandler sh : escritores) {
                sh.encerrar();
            }
        } catch (IOException e) {
            encerrar();
        }
    }

    class ServidorHandler implements Runnable {

        private Socket socket;
        private PrintWriter escritor;

        public ServidorHandler(Socket cliente) {
            this.socket = cliente;
        }

        @Override
        public void run() {

            while (true) {
                try {

                    ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
                    Mensagem data = (Mensagem) inputStream.readObject();

                    if (data.getUsuario().getSexo().equals("Feminino") && data.getUsuario().getFuncao().equals("Inspetor")) {
                        String troca = data.getUsuario().getFuncao().replace("r", "ra");
                        transmissao(troca + " " + data.getUsuario().getNome() + " : " + "\n" + data.getMensagem() + "\n");
                    } else if (data.getUsuario().getSexo().equals("Feminino") && data.getUsuario().getFuncao().equals("Secretario")) {
                        String troca = data.getUsuario().getFuncao().replace("o", "a");
                        transmissao(troca + " " + data.getUsuario().getNome() + " : " + "\n" + data.getMensagem() + "\n");
                    } else {
                        transmissao(data.getUsuario().getFuncao() + " " + data.getUsuario().getNome() + " : " + "\n" + data.getMensagem() + "\n");
                    }
                } catch (IOException | ClassNotFoundException e) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }

        public void transmitir(String mensagem) throws IOException {
            escritor = new PrintWriter(socket.getOutputStream(), true);
            escritor.println(mensagem);
        }

        public void encerrar() {
            try {
                escritor.close();
                if (!socket.isClosed()) {
                    socket.close();
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
