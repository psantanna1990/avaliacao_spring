package org.scjrbb.spring.cartao.model;

public class Aluno {

    private String nome;
    private String matricula;
    private String turma;

    public Aluno() {
    }

    public Aluno(String nome, String matricula, String turma) {
        this.nome = nome.toUpperCase();
        this.matricula = matricula.toUpperCase();
        this.turma = turma.toUpperCase();
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
}
