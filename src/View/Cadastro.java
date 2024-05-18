/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Models.Usuario;
import Repositorio.RepositorioDeUsuario;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {
    

    public Cadastro() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        initComponents();
         setLocationRelativeTo(null);
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
        lb_voltar = new javax.swing.JLabel();
        lb_sexo = new javax.swing.JLabel();
        cb_MasculinoOuFeminino = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        cb_SecretarioOuInspetor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_SecretarioOuInspetor.setForeground(new java.awt.Color(0, 204, 102));
        cb_SecretarioOuInspetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secretario", "Inspetor" }));
        cb_SecretarioOuInspetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_SecretarioOuInspetorActionPerformed(evt);
            }
        });

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

        lb_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        lb_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_voltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lb_voltar)
                .addGap(68, 68, 68)
                .addComponent(lb_NomeDoProjeto)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_voltar)
                    .addComponent(lb_NomeDoProjeto))
                .addGap(30, 30, 30))
        );

        lb_sexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_sexo.setForeground(new java.awt.Color(0, 204, 102));
        lb_sexo.setText("Sexo");

        cb_MasculinoOuFeminino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_MasculinoOuFeminino.setForeground(new java.awt.Color(0, 204, 102));
        cb_MasculinoOuFeminino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

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
                        .addGap(84, 84, 84)
                        .addComponent(lb_Nome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_SecretarioOuInspetor, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_FacaSeuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_Email)
                                    .addComponent(lb_Senha)
                                    .addComponent(lb_Celular)
                                    .addComponent(lb_SecretarioOuInspetor)
                                    .addComponent(lb_sexo)))
                            .addComponent(cb_MasculinoOuFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(Bt_Cadastro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_FacaSeuLogin)
                .addGap(24, 24, 24)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_sexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_MasculinoOuFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(Bt_Cadastro)
                .addGap(14, 14, 14))
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

    public String getTf_Celular() {
        String celular = tf_Celular.getText();
        return celular;
    }

    public String getCb_SecretarioOuInspetor() {
       String secretarioOuInspetor = String.valueOf(cb_SecretarioOuInspetor.getSelectedItem());
       return secretarioOuInspetor; 
    }

    public String getCb_MasculinoOuFemenino() {
        String masculinoOuFemenino = String.valueOf(cb_MasculinoOuFeminino.getSelectedItem());
        return masculinoOuFemenino;
    }
    
    
    
    private void limparCamposDeEntrada() {
    tf_Nome.setText("");
    tf_Email.setText("");
    Senha.setText("");
    tf_Celular.setText("");
}
    
    
    public boolean validarNome(String nome) {
    return nome != null && nome.trim().length() >= 3 && nome.trim().length() <= 100;
}  
    
    public boolean validarEmail(String email) {
    String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    return email.matches(regex);
}
    
    public boolean validarSenha(String senha) {
    return senha != null && senha.trim().length() >= 4;
}
    public  boolean validarNumero(String celular) {
        String regex = "\\(?\\d{2}\\)?\\s?9\\d{4}-\\d{4}";
        return celular.matches(regex);
    }
    
    
    
    private void tf_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomeActionPerformed

    }//GEN-LAST:event_tf_NomeActionPerformed

    private void Bt_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_CadastroActionPerformed
    String nome = getTf_Nome();
    String email = getTf_Email();
    String senha = geTf_Senha();
    String celular = getTf_Celular();
    String funcao = getCb_SecretarioOuInspetor();
    String sexo = getCb_MasculinoOuFemenino();
    
    if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    if (!validarNome(nome)) {
    JOptionPane.showMessageDialog(this, "O nome deve ter entre 3 e 50 caracteres.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
    return;
}
    
    if (!validarEmail(email)) {
    JOptionPane.showMessageDialog(this, "O email deve seguir a seguinte regra nome@dominio.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
    return;
}
    
    if (!validarSenha(senha)) {
    JOptionPane.showMessageDialog(this, "A senha tem que possuir mais que 3 caracteres.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
    return;
}
    
      if (!validarNumero(celular)) {
    JOptionPane.showMessageDialog(this, "O número deve começar com o dd e depois os numero ex (11) 1111-1111.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
    return;
}
    
    
    try (Connection conexao = BancoDeDados.BancoDeDadosConexao.getConnection()) {
        RepositorioDeUsuario repositorio = new RepositorioDeUsuario(conexao);
        Usuario usuario = new Usuario(nome, email, senha ,celular , funcao, sexo);
        repositorio.salvarUsuario(usuario);
        limparCamposDeEntrada();
        JOptionPane.showMessageDialog(this, "Usuário criado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
      
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao criar usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    
}
    }//GEN-LAST:event_Bt_CadastroActionPerformed

    private void lb_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_voltarMouseClicked
            TelaInicial inicio = new TelaInicial();
            this.dispose();
            inicio.setVisible(true);
    }//GEN-LAST:event_lb_voltarMouseClicked

    private void cb_SecretarioOuInspetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_SecretarioOuInspetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_SecretarioOuInspetorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Cadastro;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JComboBox<String> cb_MasculinoOuFeminino;
    private javax.swing.JComboBox<String> cb_SecretarioOuInspetor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_Celular;
    private javax.swing.JLabel lb_Email;
    private javax.swing.JLabel lb_FacaSeuLogin;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_NomeDoProjeto;
    private javax.swing.JLabel lb_SecretarioOuInspetor;
    private javax.swing.JLabel lb_Senha;
    private javax.swing.JLabel lb_sexo;
    private javax.swing.JLabel lb_voltar;
    private javax.swing.JTextField tf_Celular;
    private javax.swing.JTextField tf_Email;
    private javax.swing.JTextField tf_Nome;
    // End of variables declaration//GEN-END:variables
}
