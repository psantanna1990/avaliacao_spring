package org.scjrbb.spring.cartao.controller;

import java.io.FileReader;
import java.util.Scanner;

import org.scjrbb.spring.cartao.model.Transacao;
import org.scjrbb.spring.cartao.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

@RestController
public class InserirTransacaoBatchController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @PostMapping("/batch")
    @ApiOperation(value = "Recebe transações de um ou mais alunos")
    @ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Transações recebidas com sucesso"),
            @io.swagger.annotations.ApiResponse(code = 400, message = "Erro ao executar o batch")
    })

    public String cadastrarTransacao(String file) {
        file = "transacoes.csv";

        System.out.println("GO TRANSACOES, GO!!!");
        try {
            Scanner scanner = new Scanner(new FileReader(file));
            int counter = 0;
            while (scanner.hasNextLine()) {

                System.out.println(counter);
                counter++;

                String line = scanner.nextLine();
                String[] fields = line.split(",");

                Transacao transacao = new Transacao();
                transacao.setData(fields[0]);
                transacao.setBeneficiario(fields[1]);
                transacao.setValor(fields[2]);
                transacao.setCartao(fields[3]);
                transacaoRepository.save(transacao);
            }
            System.out.println("AAAAAAND DONE!!!");
            scanner.close();
            return "Transações recebidas com sucesso";
        } catch (Exception e) {
            return "Erro ao executar o batch";
        }
    }
    
}
