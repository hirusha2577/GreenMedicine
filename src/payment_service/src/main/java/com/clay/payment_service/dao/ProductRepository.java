package com.clay.payment_service.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.clay.payment_service.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
