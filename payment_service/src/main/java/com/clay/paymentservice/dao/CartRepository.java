package com.clay.paymentservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.clay.paymentservice.domain.Cart;

public interface CartRepository extends MongoRepository<Cart, String> {

}
