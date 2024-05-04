/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import Models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Leko
 */
public class RepositorioDeUsuario {
    
   private Connection conexao;

    public RepositorioDeUsuario(Connection conexao) {
        this.conexao = conexao;
    }
    
 public Usuario getUserByEmail(String email) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE email = ?";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setString(1, email);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Usuario(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("email"),
                        resultSet.getString("senha")
                    );
                }
            }
        }
        return null;
    }
    
     public Usuario getUserBySenha(String senha) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE senha = ?";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setString(1, senha);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Usuario(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("email"),
                        resultSet.getString("senha")
                    );
                }
            }
        }
        return null;
    }
     
     public Usuario getUserByNome(String nome) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE nome = ?";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setString(1, nome);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Usuario(
                        resultSet.getInt("id"),
                        resultSet.getString("nome")
                    );
                }
            }
        }
        return null;
    }
     
    public void salvarUsuario(Usuario usuario) throws SQLException {
    String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";
    try (PreparedStatement statement = conexao.prepareStatement(sql)) {
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getEmail());
        statement.setString(3, usuario.getSenha());
        statement.executeUpdate();
    }
}
    
}
   
