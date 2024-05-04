/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import BancoDeDados.BancoDeDadosConexao;
import Models.Usuario;
import Repositorio.RepositorioDeUsuario;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cb_SecretarioOuInspetor = new javax.swing.JComboBox<>();
        lb_SecretarioOuInspetor = new javax.swing.JLabel();
        tf_Celular = new javax.swing.JTextField();
        lb_Celular = new javax.swing.JLabel();
        tf_Email = new javax.swing.JTextField();
        lb_Email = new javax.swing.JLabel();
        Bt_Cadastro = new javax.swing.JButton();
        Senha = new javax.swing.JPasswordField();
        lb_Senha = new javax.swing.JLabel();
        lb_Nome = new javax.swing.JLabel();
        tf_Nome = new javax.swing.JTextField();
        lb_FacaSeuLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_NomeDoProjeto = new javax.swing.JLabel();
        lb_Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        cb_SecretarioOuInspetor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_SecretarioOuInspetor.setForeground(new java.awt.Color(0, 204, 102));
        cb_SecretarioOuInspetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secretario", "Inspetor" }));

        lb_SecretarioOuInspetor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_SecretarioOuInspetor.setForeground(new java.awt.Color(0, 204, 102));
        lb_SecretarioOuInspetor.setText("Você é secretario ou inspetor ?");

        tf_Celular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_Celular.setForeground(new java.awt.Color(0, 204, 102));
        tf_Celular.setText("Digite o número do seu celular");

        lb_Celular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_Celular.setForeground(new java.awt.Color(0, 204, 102));
        lb_Celular.setText("Celular");

        tf_Email.setForeground(new java.awt.Color(0, 204, 102));
        tf_Email.setText("Digite o seu email");

        lb_Email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_Email.setForeground(new java.awt.Color(0, 204, 102));
        lb_Email.setText("Email");

        Bt_Cadastro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Bt_Cadastro.setForeground(new java.awt.Color(0, 204, 102));
        Bt_Cadastro.setText("Cadastro");
        Bt_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_CadastroActionPerformed(evt);
            }
        });

        Senha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Senha.setForeground(new java.awt.Color(0, 204, 102));

        lb_Senha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_Senha.setForeground(new java.awt.Color(0, 204, 102));
        lb_Senha.setText("Senha");

        lb_Nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_Nome.setForeground(new java.awt.Color(0, 204, 102));
        lb_Nome.setText("Nome");

        tf_Nome.setForeground(new java.awt.Color(0, 204, 102));
        tf_Nome.setText("Digite o seu nome");
        tf_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NomeActionPerformed(evt);
            }
        });

        lb_FacaSeuLogin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lb_FacaSeuLogin.setForeground(new java.awt.Color(0, 204, 102));
        lb_FacaSeuLogin.setText("          Cadastro");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        lb_NomeDoProjeto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lb_NomeDoProjeto.setForeground(new java.awt.Color(0, 204, 102));
        lb_NomeDoProjeto.setText("ChatComigo");

        lb_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/convert_to_image.png"))); // NOI18N
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
                .addGap(35, 35, 35)
                .addComponent(lb_Logo)
                .addGap(46, 46, 46)
                .addComponent(lb_NomeDoProjeto)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_Logo)
                    .addComponent(lb_NomeDoProjeto))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bt_Cadastro)
                .addGap(154, 154, 154))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lb_Nome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_Email)
                                    .addComponent(lb_Senha)
                                    .addComponent(lb_Celular)
                                    .addComponent(lb_SecretarioOuInspetor)))
                            .addComponent(cb_SecretarioOuInspetor, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lb_FacaSeuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_FacaSeuLogin)
                .addGap(18, 18, 18)
                .addComponent(lb_Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lb_Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Celular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_SecretarioOuInspetor)
                .addGap(12, 12, 12)
                .addComponent(cb_SecretarioOuInspetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bt_Cadastro)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public String getTf_Nome() {
        String nome = tf_Nome.getText();
        return nome;
    }

    public String getTf_Email() {
        String email = tf_Email.getText();
        return email;
    }

    public String geTf_Senha() {
        String senha = String.valueOf(Senha.getPassword());
        return senha;
    }

    public int getTf_Celular() {
        Integer celular = Integer.parseInt((tf_Celular.getText()));
        return celular;
    }

    public String getCb_SecretarioOuInspetor() {
       String secretarioOuInspetor = String.valueOf(cb_SecretarioOuInspetor.getSelectedItem());
       return secretarioOuInspetor; 
    }
    
    
    private void limparCamposDeEntrada() {
    tf_Nome.setText("");
    tf_Email.setText("");
    Senha.setText("");
    tf_Celular.setText("");
}
         
    
    private void tf_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomeActionPerformed

    }//GEN-LAST:event_tf_NomeActionPerformed

    private void Bt_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_CadastroActionPerformed
       
         String nome = getTf_Nome();
    String email = getTf_Email();
    String senha = geTf_Senha();
    
    if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try (Connection conexao = BancoDeDados.BancoDeDadosConexao.getConnection()) {
        RepositorioDeUsuario repositorio = new RepositorioDeUsuario(conexao);
        
        Usuario usuario = new Usuario(nome, email, senha);
        repositorio.salvarUsuario(usuario);
        limparCamposDeEntrada();
        JOptionPane.showMessageDialog(this, "Usuário criado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao criar usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    
}
    }//GEN-LAST:event_Bt_CadastroActionPerformed

    private void lb_LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_LogoMouseClicked
            TelaInicial inicio = new TelaInicial();
            this.dispose();
            inicio.setVisible(true);
    }//GEN-LAST:event_lb_LogoMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Cadastro;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JComboBox<String> cb_SecretarioOuInspetor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_Celular;
    private javax.swing.JLabel lb_Email;
    private javax.swing.JLabel lb_FacaSeuLogin;
    private javax.swing.JLabel lb_Logo;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_NomeDoProjeto;
    private javax.swing.JLabel lb_SecretarioOuInspetor;
    private javax.swing.JLabel lb_Senha;
    private javax.swing.JTextField tf_Celular;
    private javax.swing.JTextField tf_Email;
    private javax.swing.JTextField tf_Nome;
    // End of variables declaration//GEN-END:variables
}
