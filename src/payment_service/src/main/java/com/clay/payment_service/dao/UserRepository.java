package com.clay.payment_service.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clay.payment_service.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
