package org.scjrbb.spring.cartao.controller;

import org.scjrbb.spring.cartao.model.Transacao;
import org.scjrbb.spring.cartao.repository.TransacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

@RestController
public class InserirTransacaoController {
    
    @Autowired
    private TransacaoRepository transacaoRepository;

    @PostMapping("/transacao")
    @ApiOperation(value = "Recebe transações de um ou mais alunos")
    @ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Transações recebidas com sucesso"),
    })
    private ResponseEntity<String> cadastrarTransacao(@RequestBody Transacao transacao) {
        transacaoRepository.save(transacao);
        return new ResponseEntity<String>("Transações recebidas com sucesso", HttpStatus.CREATED);
    }
}
