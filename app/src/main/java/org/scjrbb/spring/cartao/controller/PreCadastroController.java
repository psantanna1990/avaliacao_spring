package org.scjrbb.spring.cartao.controller;

import java.io.FileReader;
import java.util.Scanner;

import org.scjrbb.spring.cartao.model.Aluno;
import org.scjrbb.spring.cartao.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreCadastroController {

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping("/precadastro")
    public String preCadastro() {

        System.out.println("Efetuando o precadastro");

        try {
            try (Scanner preCadastroScanner = new Scanner(new FileReader("lista_alunos.txt")).useDelimiter("\\n")) {
                while (preCadastroScanner.hasNextLine()) {

                    System.out.println("...");

                    String linha = preCadastroScanner.nextLine();

                    if (linha.length() == 55 && linha.charAt(0) != '-') {

                        Aluno aluno = new Aluno(linha.substring(0, 40), linha.substring(41, 48),
                                linha.substring(49, 55));
                        alunoRepository.save(aluno);
                    }

                }

                preCadastroScanner.close();
            }

            return "Precadastro efetuado com sucesso";
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return "Não Foi possível realizar o precadastro";

        }
    }

}
