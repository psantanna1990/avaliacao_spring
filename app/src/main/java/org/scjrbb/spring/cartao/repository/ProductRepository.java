package org.scjrbb.spring.cartao.repository;

import org.scjrbb.spring.cartao.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Query("{id: '?0'")
    List<Product> findAll(String product);

    public long count();

}
