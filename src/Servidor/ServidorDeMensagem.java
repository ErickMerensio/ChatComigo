package Servidor;

import View.TelaLogado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorDeMensagem implements Runnable {

    private BufferedReader leitor;
    private Socket cliente;
    private TelaLogado tela;

    public ServidorDeMensagem(Socket cliente, TelaLogado tela) {
        this.cliente = cliente;
        this.tela = tela;
    }

    @Override
    public void run() {
        while (true) {

            try {
                leitor = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                String mensagem;
                while ((mensagem = leitor.readLine()) != null) {
                    tela.receberMensagem(mensagem);
                }
            } catch (IOException ex) {
                Logger.getLogger(ServidorDeMensagem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
