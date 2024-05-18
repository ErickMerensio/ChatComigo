/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import Models.Usuario;
import View.TelaLogado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JPanel;

public class EmojiPanel extends JPanel {
    
    private Cliente cliente;
    private Usuario usuario;
    private TelaLogado chat;
    
    public EmojiPanel(Usuario usuario,TelaLogado chat) {
        try {
            this.usuario = usuario;
            this.cliente = new Cliente(chat,usuario);
            this.chat = new TelaLogado(usuario);
         
            new ServidorDeMensagem(cliente.getSocket(),chat);      
            addEmoji("😀");
            addEmoji("👍");
            addEmoji("😭");
            addEmoji("❤");
            addEmoji("🐸");
            addEmoji("☠");
            addEmoji("✈");
            addEmoji("👎");
            addEmoji("🤜");
            addEmoji("🤛");
            addEmoji("💔");
            addEmoji("💩");
            addEmoji("🔥");
            addEmoji("👀");
            addEmoji("🤡");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(EmojiPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
       private void addEmoji(String emoji) {
        JButton botao = new JButton(emoji);
        botao.addActionListener(new EmojiButtonListener(emoji));
        add(botao);
    }

    private class EmojiButtonListener implements ActionListener {
        private String emoji;

        public EmojiButtonListener(String emoji) {
            this.emoji = emoji;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            cliente.enviarMensagem(emoji);
        }
    }

}
