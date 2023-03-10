package com.login.sistema.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigInteger;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private BigInteger cpf;
    private BigInteger telefone;
    private String senha;

    public Aluno() { }
    public Aluno( String nome, String sobrenome, String email, BigInteger cpf, BigInteger telefone, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public BigInteger getTelefone() {
        return telefone;
    }

    public void setTelefone(BigInteger telefone) {
        this.telefone = telefone;
    }

    public BigInteger getCpf() {
        return cpf;
    }

    public void setCpf(BigInteger cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + id +
                "nome='" + nome + " " + nome.getClass().getSimpleName() +'\'' +
                ", sobrenome='" + sobrenome + " " + sobrenome.getClass().getSimpleName() + '\'' +
                ", email='" + email + " " + email.getClass().getSimpleName() +'\'' +
                ", cpf='" + cpf + " " + cpf.getClass().getSimpleName() + '\'' +
                ", telefone='" + telefone + " " + telefone.getClass().getSimpleName() + '\'' +
                ", senha='" + senha + " " + senha.getClass().getSimpleName() + '\'' +
                '}';
    }
}