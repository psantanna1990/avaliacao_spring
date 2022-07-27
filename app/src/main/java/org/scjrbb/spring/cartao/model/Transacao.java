package org.scjrbb.spring.cartao.model;

public class Transacao {
    private String data;
    private String beneficiario;
    private String valor;
    private String cartao;

    public Transacao() {
    }

    public Transacao(String data, String beneficiario, String valor, String cartao) {
        this.data = data;
        this.beneficiario = beneficiario.toUpperCase();
        this.valor = valor;
        this.cartao = cartao;
    }


    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getBeneficiario() {
        return this.beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario.toUpperCase();
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCartao() {
        return this.cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

}
