/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author joao
 */
public class Pessoa {
    
    String cpf;
    String nome;
    String celular;
    String email;
    int idade;
    
    public Pessoa() {
        cpf = "";
        nome = "";
        celular = "";
        email = "";
        idade = 0;
    }

    public Pessoa(String cpf, String nome, String celular, String email, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
