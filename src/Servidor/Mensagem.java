package Servidor;

import Models.Usuario;
import java.io.Serializable;

public class Mensagem implements Serializable{

    public Mensagem(String mensagem, Usuario usuario) {
        this.mensagem = mensagem;
        this.usuario = usuario;
    }

    private final  String mensagem;
    private final Usuario usuario;

    public String getMensagem() {
        return mensagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

}
