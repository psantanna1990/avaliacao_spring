package org.scjrbb.spring.cartao.controller;

import java.util.List;

import org.scjrbb.spring.cartao.model.Aluno;
import org.scjrbb.spring.cartao.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

@RestController
public class CadastroNovoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping("/novo")
    @ApiOperation(value = "Efetua o cadastro de um novo aluno")
    @ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 201, message = "Cadastrado com sucesso "),
    })
    private ResponseEntity<String> cadastrarNovo(@RequestBody Aluno aluno) {

        List<Aluno> alunos = alunoRepository.findByNome(aluno.getNome());

        if (alunos.size() != 0) {
            return new ResponseEntity<String>("Aluno já cadastrado", HttpStatus.BAD_REQUEST);
        }

        else {
            String cartao = "matricula + turma";
            Integer saldo = 0;
            String email = "matricula@fiap.com.br";
            aluno.setCartao(cartao);
            aluno.setSaldo(saldo);
            aluno.setEmail(email);

            alunoRepository.save(aluno);
            return new ResponseEntity<String>("Cliente cadastrado com sucesso", HttpStatus.CREATED);
        }

    }

}
