package com.clay.paymentservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clay.paymentservice.domain.TransactionHeader;

@Repository
public interface TransactionHeaderRepository extends MongoRepository<TransactionHeader, String> {

}
