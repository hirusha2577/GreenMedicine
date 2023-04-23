package com.clay.deliveryservice.service;

import org.springframework.http.ResponseEntity;

import com.clay.deliveryservice.domain.Delivery;
import com.clay.deliveryservice.models.DeliveryRequest;
import com.clay.deliveryservice.models.DeliveryResponse;


public interface DeliveryService {

	public ResponseEntity<?> getAllDeliveries();

	public DeliveryResponse addDeliveries(DeliveryRequest deliveryRequest);

	public Delivery getDeliveryById(String id);

	public DeliveryResponse deleteDelivery(String id);

}
