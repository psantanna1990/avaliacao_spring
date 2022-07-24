package org.scjrbb.spring.cartao.repository;

import org.scjrbb.spring.cartao.model.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AlunoRepository extends MongoRepository<Aluno, String> {

    @Query("{id: '?0'")
    List<Aluno> findAll(String aluno);

    List<Aluno> findByNome(String nome);

    public long count();

}
