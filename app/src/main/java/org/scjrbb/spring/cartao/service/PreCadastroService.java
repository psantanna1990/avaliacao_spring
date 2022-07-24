package org.scjrbb.spring.cartao.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class PreCadastroService {

    @PostConstruct
    public void init() {
        System.out.println("Efetuando o precadastro");

        // TODO aqui vai a logica do precadastro
        for (int i = 0; i < 10; i++) {
            System.out.println("Cadastrando o produto " + i);
        }

        System.out.println("Cadastro efetuado com sucesso");
    }

}
