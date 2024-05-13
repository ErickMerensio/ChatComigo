/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Models.Usuario;
import Servidor.Cliente;
import Servidor.EmojiPanel;
import Servidor.ServidorDeMensagem;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;




public class TelaLogado extends javax.swing.JFrame{   
    private Cliente cliente;
    private Usuario usuario;
     
    public TelaLogado(Usuario usuario) {
        this.usuario = usuario;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        try {
            this.cliente = new Cliente(this,usuario);  
            new Thread(new ServidorDeMensagem(cliente.getSocket(),this)).start();
               ta_mensagem.setEditable(false);
               lb_Saudacao.setText(usuario.getNome());
               lb_Saudacao.setForeground(new java.awt.Color(0, 204, 102));
        } catch (IOException ex) {
            Logger.getLogger(TelaLogado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_Saudacao = new javax.swing.JLabel();
        lb_Saida = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NomeUm = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tf_chat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_mensagem = new javax.swing.JTextArea();
        jb_emoji = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 102));
        jLabel1.setText("ChatComigo");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        lb_Saudacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_Saudacao.setForeground(new java.awt.Color(0, 0, 0));
        lb_Saudacao.setText("Nome");

        lb_Saida.setText("Saida");
        lb_Saida.setMaximumSize(new java.awt.Dimension(50, 50));
        lb_Saida.setMinimumSize(new java.awt.Dimension(50, 50));
        lb_Saida.setPreferredSize(new java.awt.Dimension(50, 50));
        lb_Saida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_SaidaMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        NomeUm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NomeUm.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tf_chat.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tf_chatInputMethodTextChanged(evt);
            }
        });
        tf_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_chatActionPerformed(evt);
            }
        });

        ta_mensagem.setBackground(new java.awt.Color(255, 255, 255));
        ta_mensagem.setColumns(20);
        ta_mensagem.setForeground(new java.awt.Color(0, 0, 0));
        ta_mensagem.setRows(5);
        jScrollPane1.setViewportView(ta_mensagem);

        jb_emoji.setBackground(new java.awt.Color(255, 255, 255));
        jb_emoji.setForeground(new java.awt.Color(255, 255, 255));
        jb_emoji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/emotion.png"))); // NOI18N
        jb_emoji.setMaximumSize(new java.awt.Dimension(32, 16));
        jb_emoji.setPreferredSize(new java.awt.Dimension(32, 16));
        jb_emoji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_emojiMouseClicked(evt);
            }
        });
        jb_emoji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_emojiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(NomeUm)
                .addGap(44, 44, 44)
                .addComponent(jb_emoji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_chat, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(NomeUm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_chat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jb_emoji, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jLabel6.setText("Chamada");

        jLabel7.setText("Camera");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_Saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_Saudacao)
                .addGap(98, 98, 98)
                .addComponent(jLabel6)
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Saudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_SaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_SaidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_SaidaMouseClicked

    private void tf_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_chatActionPerformed
        getTf_chat();
    }//GEN-LAST:event_tf_chatActionPerformed

    private void tf_chatInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tf_chatInputMethodTextChanged

    }//GEN-LAST:event_tf_chatInputMethodTextChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String mensagem = getTf_chat();
        cliente.enviarMensagem(mensagem);
        tf_chat.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jb_emojiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_emojiActionPerformed
 
    }//GEN-LAST:event_jb_emojiActionPerformed

    private void jb_emojiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_emojiMouseClicked
         jb_emoji.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
          
        JDialog emojiDialog = new JDialog();
        emojiDialog.setTitle("Escolha um Emoji");
        emojiDialog.setSize(200, 200);
        emojiDialog.setLocationRelativeTo(null);
        EmojiPanel emojiPanel = new EmojiPanel(usuario,TelaLogado.this);
        emojiDialog.add(emojiPanel);
        emojiDialog.setVisible(true);
    }
});
    }//GEN-LAST:event_jb_emojiMouseClicked

    
    public String getTf_chat() {
        String mensagem = tf_chat.getText();
        return mensagem;
    }

      public void setChat(String mensagem) {
        tf_chat.setText(mensagem);
    } 
      
      public void receberMensagem(String mensagem) {
    SwingUtilities.invokeLater(() -> {  
      ta_mensagem.append("\n" + mensagem);
       ta_mensagem.setCaretPosition(ta_mensagem.getDocument().getLength());
    });
}   
      public void alterarCorNomeUsuario(Color cor) {
          lb_Saudacao.setForeground(cor);
}

      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeUm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_emoji;
    private javax.swing.JLabel lb_Saida;
    private javax.swing.JLabel lb_Saudacao;
    private javax.swing.JTextArea ta_mensagem;
    private javax.swing.JTextField tf_chat;
    // End of variables declaration//GEN-END:variables

}
