/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;

public class Usuario implements Serializable{
      
    private int id;
    private String nome;
    private String email;
    private String funcao;
    private int celular;
    private String senha;

    public Usuario(int id, String nome , String email , String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
     public Usuario(String nome , String email , String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
     
     public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
          
    public int getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
}
