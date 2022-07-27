package org.scjrbb.spring.cartao.model;

public class Aluno {

    private String nome;
    private String matricula;
    private String turma;
    private String cartao;
    private Integer saldo;
    private String email;

    public Aluno() {}

    public Aluno(String nome, String matricula, String turma, String cartao, Integer saldo, String email) {
        this.nome = nome.toUpperCase();
        this.matricula = matricula.toUpperCase();
        this.turma = turma.toUpperCase();
        this.cartao = cartao.toUpperCase();
        this.saldo = saldo;
        this.email = email.toLowerCase();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula.toUpperCase();
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma.toUpperCase();
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.toLowerCase();
    }

    
}
