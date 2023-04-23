package com.clay.deliveryservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clay.deliveryservice.domain.Delivery;

@Repository
public interface DeliveryRepository extends MongoRepository<Delivery, String> {
	
}
