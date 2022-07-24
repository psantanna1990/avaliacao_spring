package org.scjrbb.spring.cartao.repository;

import org.scjrbb.spring.cartao.model.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlunoRepository extends MongoRepository<Aluno, String> {

}