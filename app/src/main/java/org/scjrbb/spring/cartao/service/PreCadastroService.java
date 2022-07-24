package org.scjrbb.spring.cartao.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.scjrbb.spring.cartao.dao.AlunoDao;
import org.scjrbb.spring.cartao.model.Aluno;
import org.springframework.stereotype.Service;

@Service
public class PreCadastroService {

    @PostConstruct
    public void init() throws FileNotFoundException {
        System.out.println("Efetuando o precadastro");

        Scanner preCadastroScanner = new Scanner(new FileReader("lista_alunos.txt")).useDelimiter("\\n");
        AlunoDao dao = new AlunoDao();

        while (preCadastroScanner.hasNextLine()) {

            String linha = preCadastroScanner.nextLine();

            if (linha.length() == 55 && linha.charAt(0) != '-') {

                Aluno aluno = new Aluno(linha.substring(0, 40), linha.substring(41, 48), linha.substring(49, 55));
                dao.addAluno(aluno);
            }

        }

        System.out.println("Carga inicial efetuada com sucesso");
    }

}
