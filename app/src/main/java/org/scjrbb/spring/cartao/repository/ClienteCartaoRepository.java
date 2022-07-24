package org.scjrbb.spring.cartao.repository;

import java.util.List;

import org.scjrbb.spring.cartao.model.ClienteCartao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ClienteCartaoRepository extends MongoRepository<ClienteCartao, String> {

    @Query("{id: '?0'")
    List<ClienteCartao> findAll(String clienteCartao);

    public long count();

}