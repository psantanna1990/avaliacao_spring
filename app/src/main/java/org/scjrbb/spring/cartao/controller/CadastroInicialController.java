package org.scjrbb.spring.cartao.controller;

import java.io.FileReader;
import java.util.Scanner;

import org.scjrbb.spring.cartao.model.Aluno;
import org.scjrbb.spring.cartao.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

@RestController
public class CadastroInicialController {

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping("/cadastro")
    @ApiOperation(value = "Efetua o CADASTRO INICIAL dos alunos para usarem o cartão")
    @ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Cadastro inicial realizado com sucesso"),
            @io.swagger.annotations.ApiResponse(code = 400, message = "Erro ao executar o cadastro inicial") })
    public String cadastro() {

        System.out.println("Efetuando o cadastro");

        try {
            try (Scanner cadastroScanner = new Scanner(new FileReader("/usr/local/lib/lista_alunos.txt")).useDelimiter("\\n")) {
                int counter = 0;
                while (cadastroScanner.hasNextLine()) {

                    System.out.println(counter);
                    counter++;

                    String linha = cadastroScanner.nextLine();

                    if (linha.length() == 55 && linha.charAt(0) != '-') {

                        String nome = linha.substring(0, 40).trim();
                        String matricula = linha.substring(41, 48).trim();
                        String turma = linha.substring(49, 55).trim();
                        String cartao = linha.substring(41, 48).trim()+linha.substring(49, 55).trim();
                        Integer saldo = 0;
                        String email = linha.substring(41, 48).trim()+"@fiap.com.br";

                        Aluno aluno = new Aluno(
                                nome,
                                matricula,
                                turma,
                                cartao,
                                saldo,
                                email
                            );
                        alunoRepository.save(aluno);
                    }

                }

                System.out.println("aaaand done.");

                cadastroScanner.close();
            }

            return "cadastro inicial efetuado com sucesso";
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return "Não Foi possível realizar o cadastro inicial";

        }
    }

}
