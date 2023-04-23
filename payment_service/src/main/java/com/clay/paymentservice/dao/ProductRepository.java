package com.clay.paymentservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.clay.paymentservice.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
