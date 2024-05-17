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
            //new Thread(new ServidorDeMensagem(cliente.getSocket(),chat)).start();
            new ServidorDeMensagem(cliente.getSocket(),chat);
            // Adicionar botões de emojis
            JButton emojiButton1 = new JButton("\uD83D\uDE00"); // Exemplo de emoji (smiley face)
            emojiButton1.addActionListener(new EmojiButtonListener("\uD83D\uDE00")); // Adiciona listener para enviar emoji ao clicar
            add(emojiButton1);
            // Adicione mais botões conforme necessário
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(EmojiPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
