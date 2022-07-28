package org.scjrbb.spring.cartao.controller;

import org.scjrbb.spring.cartao.model.dto.ResponseExtratoDTO;
import org.scjrbb.spring.cartao.repository.TransacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

@RestController
public class ExtratoController {
    
    @Autowired
    private TransacaoRepository transacaoRepository;

    @GetMapping("/extrato")
    @ApiOperation(value = "Retorna o extrato do cartão")
    @ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Transações recebidas com sucesso"),
    })
    private ResponseEntity<ResponseExtratoDTO> cadastrarTransacao(@RequestParam String cartao) {


        ResponseExtratoDTO retorno = new ResponseExtratoDTO();

        
        retorno.setCartao(cartao);
        retorno.setTransacoes(transacaoRepository.findByCartao(cartao));
       
   
        return new ResponseEntity<ResponseExtratoDTO>(retorno, HttpStatus.CREATED);
    }
}
