package View;

import Models.Usuario;
import Servidor.Cliente;
import Servidor.EmojiPanel;
import Servidor.ServidorDeMensagem;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TelaLogado extends javax.swing.JFrame{   
    private Cliente cliente;
    private Usuario usuario;
     
    public TelaLogado(Usuario usuario) {
        this.usuario = usuario;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        try {
            this.cliente = new Cliente(this,usuario);  
            new Thread(new ServidorDeMensagem(cliente.getSocket(),this)).start();
               ta_mensagem.setEditable(false);
               
               if(usuario.getSexo().equals("Feminino") && usuario.getFuncao().equals("Secretario")) {
                String troca = usuario.getFuncao().replace("o", "a");
               lb_Saudacao.setText(troca.toUpperCase() + " " + usuario.getNome().toUpperCase());
               }else if(usuario.getSexo().equals("Feminino") && usuario.getFuncao().equals("Inspetor")){
                   String troca = usuario.getFuncao().replace("r", "ra");
                   lb_Saudacao.setText(troca.toUpperCase() + " " + usuario.getNome().toUpperCase());
               }else
                  lb_Saudacao.setText(usuario.getFuncao().toUpperCase() + " " + usuario.getNome().toUpperCase());
               
               
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
        jPanel2 = new javax.swing.JPanel();
        NomeUm = new javax.swing.JLabel();
        bt_saida = new javax.swing.JButton();
        tf_chat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_mensagem = new javax.swing.JTextArea();
        jb_emoji = new javax.swing.JButton();
        jb_file = new javax.swing.JButton();
        bt_quit = new javax.swing.JButton();
        jb_logo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 102));
        jLabel1.setText("ChatComigo");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        lb_Saudacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lb_Saudacao.setForeground(new java.awt.Color(0, 0, 0));
        lb_Saudacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Saudacao.setText("Nome");
        lb_Saudacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        NomeUm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NomeUm.setForeground(new java.awt.Color(0, 0, 0));

        bt_saida.setBackground(new java.awt.Color(255, 255, 255));
        bt_saida.setForeground(new java.awt.Color(255, 255, 255));
        bt_saida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/enviar.png"))); // NOI18N
        bt_saida.setBorder(null);
        bt_saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saidaActionPerformed(evt);
            }
        });

        tf_chat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
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
        ta_mensagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(ta_mensagem);

        jb_emoji.setBackground(new java.awt.Color(255, 255, 255));
        jb_emoji.setForeground(new java.awt.Color(255, 255, 255));
        jb_emoji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/emoji.png"))); // NOI18N
        jb_emoji.setBorder(null);
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

        jb_file.setBackground(new java.awt.Color(255, 255, 255));
        jb_file.setForeground(new java.awt.Color(255, 255, 255));
        jb_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/file.png"))); // NOI18N
        jb_file.setBorder(null);
        jb_file.setMaximumSize(new java.awt.Dimension(32, 16));
        jb_file.setPreferredSize(new java.awt.Dimension(32, 16));
        jb_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_fileMouseClicked(evt);
            }
        });
        jb_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_fileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(NomeUm)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jb_file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_emoji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_saida, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(NomeUm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_chat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_saida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_file, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_emoji, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );

        bt_quit.setBackground(new java.awt.Color(255, 255, 255));
        bt_quit.setForeground(new java.awt.Color(255, 255, 255));
        bt_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        bt_quit.setBorder(null);
        bt_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_Saudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_Saudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N
        jb_logo.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jb_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(248, 248, 248))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jb_logo))
                .addGap(26, 26, 26)
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

    private void tf_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_chatActionPerformed
         String mensagem = getTf_chat(); 
    cliente.enviarMensagem(mensagem); 
    tf_chat.setText(""); 
    }//GEN-LAST:event_tf_chatActionPerformed

    private void tf_chatInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tf_chatInputMethodTextChanged

    }//GEN-LAST:event_tf_chatInputMethodTextChanged

    private void bt_saidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saidaActionPerformed
        String mensagem = getTf_chat();
        cliente.enviarMensagem(mensagem);
        tf_chat.setText("");
    }//GEN-LAST:event_bt_saidaActionPerformed

    private void jb_emojiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_emojiActionPerformed
 
    }//GEN-LAST:event_jb_emojiActionPerformed

    private void jb_emojiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_emojiMouseClicked
         jb_emoji.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
          
        JDialog emojiDialog = new JDialog();
        emojiDialog.setTitle(usuario.getNome().toUpperCase() + " escolha um Emoji");
        emojiDialog.setSize(300, 300);
        emojiDialog.setLocationRelativeTo(null);
        EmojiPanel emojiPanel = new EmojiPanel(usuario,TelaLogado.this);
        emojiDialog.add(emojiPanel);
        emojiDialog.setVisible(true);
    }
});
    }//GEN-LAST:event_jb_emojiMouseClicked

    private void jb_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_fileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_fileMouseClicked

    private void jb_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_fileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt", "csv"));
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                String fileName = selectedFile.getName();
                if (fileName.endsWith(".txt") || fileName.endsWith(".csv")) {
                    StringBuilder content = new StringBuilder();
                    try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            content.append(line).append("\n");
                        }
                       cliente.enviarMensagem(content.toString());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, "Erro ao ler o arquivo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Selecione um arquivo de texto (TXT ou CSV).", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao selecionar o arquivo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jb_fileActionPerformed

    private void bt_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quitActionPerformed
        System.exit(0);       
    }//GEN-LAST:event_bt_quitActionPerformed

    
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
      
      private void tf_chatKeyPressed(java.awt.event.KeyEvent evt) {                                   
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String mensagem = getTf_chat();
        cliente.enviarMensagem(mensagem);
        tf_chat.setText("");
    }
      }
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeUm;
    private javax.swing.JButton bt_quit;
    private javax.swing.JButton bt_saida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_emoji;
    private javax.swing.JButton jb_file;
    private javax.swing.JButton jb_logo;
    private javax.swing.JLabel lb_Saudacao;
    private javax.swing.JTextArea ta_mensagem;
    private javax.swing.JTextField tf_chat;
    // End of variables declaration//GEN-END:variables

}

