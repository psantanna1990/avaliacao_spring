package org.scjrbb.spring.cartao.services;

import java.util.List;

import org.scjrbb.spring.cartao.model.Aluno;
import org.scjrbb.spring.cartao.model.ClienteCartao;
import org.scjrbb.spring.cartao.repository.AlunoRepository;
import org.scjrbb.spring.cartao.repository.ClienteCartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

public class CadastroClienteCartaoService {

    // @Autowired
    // private AlunoRepository alunoRepository;

    // @Autowired
    // private ClienteCartaoRepository clienteCartaoRepository;

    public ResponseEntity<String> cadastrarClienteCartao(ClienteCartao clienteCartao) {

        System.out.println(clienteCartao.getNome());

        // List<Aluno> alunos = alunoRepository.findByName(clienteCartao.getNome());

        // for (Aluno aluno : alunos) {
        //     System.out.println(aluno.getNome());
        // }

        return ResponseEntity.status(HttpStatus.CREATED).body("Cadastrado com sucesso");
    }

}
