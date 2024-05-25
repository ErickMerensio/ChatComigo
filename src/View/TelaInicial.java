/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import BancoDeDados.BancoDeDadosConexao;
//import Servidor.Servidor;
import Models.Usuario;
import Repositorio.RepositorioDeUsuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Leko
 */
public class TelaInicial extends javax.swing.JFrame {

    private RepositorioDeUsuario repositorioUsuario;
    private Connection conexao;
    private boolean senhaVisivel = false; 
    
    public TelaInicial() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        try { 
            conexao = conexao = BancoDeDadosConexao.getConnection();
            repositorioUsuario = new RepositorioDeUsuario(conexao);
        } catch (SQLException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lb_NomeDoProjeto = new javax.swing.JLabel();
        lb_Logo = new javax.swing.JLabel();
        lb_FacaSeuLogin = new javax.swing.JLabel();
        lb_Email = new javax.swing.JLabel();
        tf_Email = new javax.swing.JTextField();
        lb_Senha = new javax.swing.JLabel();
        Senha = new javax.swing.JPasswordField();
        Bt_Cadastrar = new javax.swing.JButton();
        Bt_Entrar = new javax.swing.JButton();
        bt_mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        lb_NomeDoProjeto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lb_NomeDoProjeto.setForeground(new java.awt.Color(0, 204, 102));
        lb_NomeDoProjeto.setText("ChatComigo");

        lb_Logo.setForeground(new java.awt.Color(0, 0, 0));
        lb_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N
        lb_Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_LogoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lb_Logo)
                .addGap(48, 48, 48)
                .addComponent(lb_NomeDoProjeto)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_Logo)
                    .addComponent(lb_NomeDoProjeto))
                .addGap(28, 28, 28))
        );

        lb_FacaSeuLogin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lb_FacaSeuLogin.setForeground(new java.awt.Color(0, 204, 102));
        lb_FacaSeuLogin.setText("      Faça seu login");

        lb_Email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_Email.setForeground(new java.awt.Color(0, 204, 102));
        lb_Email.setText("Email");

        tf_Email.setForeground(new java.awt.Color(0, 204, 102));
        tf_Email.setText("Digite o seu email");
        tf_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_EmailActionPerformed(evt);
            }
        });

        lb_Senha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_Senha.setForeground(new java.awt.Color(0, 204, 102));
        lb_Senha.setText("Senha");

        Senha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Senha.setForeground(new java.awt.Color(0, 204, 102));
        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });

        Bt_Cadastrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Bt_Cadastrar.setForeground(new java.awt.Color(0, 204, 102));
        Bt_Cadastrar.setText("Cadastrar");
        Bt_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_CadastrarActionPerformed(evt);
            }
        });

        Bt_Entrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Bt_Entrar.setForeground(new java.awt.Color(0, 204, 102));
        Bt_Entrar.setText("Entrar");
        Bt_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_EntrarActionPerformed(evt);
            }
        });

        bt_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mostrar.png"))); // NOI18N
        bt_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lb_Senha))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Bt_Cadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(Bt_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_FacaSeuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lb_Email)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_FacaSeuLogin)
                .addGap(25, 25, 25)
                .addComponent(lb_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_mostrar))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Cadastrar)
                    .addComponent(Bt_Entrar))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_LogoMouseClicked
        TelaInicial inicio = new TelaInicial();
        this.dispose();
        inicio.setVisible(true);
    }//GEN-LAST:event_lb_LogoMouseClicked

    private void tf_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_EmailActionPerformed

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaActionPerformed

    private void Bt_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_CadastrarActionPerformed
        Cadastro cadastro = new Cadastro();
        this.dispose();
        cadastro.setVisible(true);
    }//GEN-LAST:event_Bt_CadastrarActionPerformed

    private void Bt_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_EntrarActionPerformed
   
    try {
        Usuario usuario = repositorioUsuario.getUserByEmail(getTf_Email());
        if (usuario != null && usuario.getSenha().equals(geTP_Senha())) { 
        TelaLogado logado = new TelaLogado(usuario);
        logado.setVisible(true);
        this.dispose();   
        } else {
            JOptionPane.showMessageDialog(this, "Credenciais inválidas. Por favor, verifique seu email e senha.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_Bt_EntrarActionPerformed

    
    private void bt_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mostrarActionPerformed
          if (senhaVisivel) {
        Senha.setEchoChar('*');
        bt_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mostrar.png"))); 
    } else {
        Senha.setEchoChar((char) 0);
        bt_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ocultar.png")));
    }
    senhaVisivel = !senhaVisivel;
    }//GEN-LAST:event_bt_mostrarActionPerformed

   
    public String getTf_Email() {
        String email = tf_Email.getText();
        return email;
    }
    
      public String geTP_Senha() {
        String senha = String.valueOf(Senha.getPassword());
        return senha;
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Cadastrar;
    private javax.swing.JButton Bt_Entrar;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JButton bt_mostrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_Email;
    private javax.swing.JLabel lb_FacaSeuLogin;
    private javax.swing.JLabel lb_Logo;
    private javax.swing.JLabel lb_NomeDoProjeto;
    private javax.swing.JLabel lb_Senha;
    private javax.swing.JTextField tf_Email;
    // End of variables declaration//GEN-END:variables
}
