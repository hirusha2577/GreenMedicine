package com.clay.payment_service.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.clay.payment_service.domain.Cart;

public interface CartRepository extends MongoRepository<Cart, String> {

}
