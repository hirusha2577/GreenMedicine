package com.clay.delivery_service.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clay.delivery_service.domain.Delivery;

@Repository
public interface DeliveryRepository extends MongoRepository<Delivery, String> {
	
}
