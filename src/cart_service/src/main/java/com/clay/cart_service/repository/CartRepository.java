package com.clay.cart_service.repository;

import com.clay.cart_service.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<Cart,String> {

    @Query(value= "{userId : ?0}")
    Cart findByUserId(String userId);
}