package org.scjrbb.spring.cartao.dao;

import org.scjrbb.spring.cartao.model.Aluno;
import org.scjrbb.spring.cartao.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AlunoDao {

    @Autowired
    private AlunoRepository alunoRepository;

    public String addAluno(Aluno aluno) {
        alunoRepository.save(aluno);
        return "Adicionado aluno com sucesso";
    }

}
