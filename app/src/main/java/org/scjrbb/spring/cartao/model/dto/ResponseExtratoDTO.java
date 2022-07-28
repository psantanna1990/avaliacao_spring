package org.scjrbb.spring.cartao.model.dto;

import java.util.List;

import org.scjrbb.spring.cartao.model.Transacao;

public class ResponseExtratoDTO {

    private String cartao;


    private List<Transacao> transacoes;

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

}
