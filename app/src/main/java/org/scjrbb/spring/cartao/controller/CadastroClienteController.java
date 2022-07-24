package org.scjrbb.spring.cartao.controller;

import java.util.List;

import org.scjrbb.spring.cartao.model.Aluno;
import org.scjrbb.spring.cartao.model.ClienteCartao;
import org.scjrbb.spring.cartao.repository.AlunoRepository;
import org.scjrbb.spring.cartao.repository.ClienteCartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

@RestController
public class CadastroClienteController {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private ClienteCartaoRepository clienteCartaoRepository;

    @PostMapping("/cliente")
    @ApiOperation(value = "Efetua o cadastro de um novo cliente")
    @ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 201, message = "Cadastrado com sucesso "),
    })
    private ResponseEntity<String> cadastrarCliente(@RequestBody ClienteCartao cliente) {

        List<Aluno> alunos = alunoRepository.findByNome(cliente.getNome());

        if (alunos.size() == 0) {
            return new ResponseEntity<String>("Cliente não faz parte do publico alvo", HttpStatus.BAD_REQUEST);
        }

        else {

            cliente.setMatricula(alunos.get(0).getMatricula());
            cliente.setTurma(alunos.get(0).getTurma());

            clienteCartaoRepository.save(cliente);
            return new ResponseEntity<String>("Cliente cadastrado com sucesso", HttpStatus.CREATED);
        }

    }

}
