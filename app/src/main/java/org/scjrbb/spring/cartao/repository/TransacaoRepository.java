package org.scjrbb.spring.cartao.repository;

import org.scjrbb.spring.cartao.model.Transacao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TransacaoRepository extends MongoRepository<Transacao, String> {

    @Query("{id: '?0'")
    List<Transacao> findAll(String transacao);

    List<Transacao> findByCartao(String cartao);

    public long count();

}
