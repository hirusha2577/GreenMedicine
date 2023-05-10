package com.clay.delivery_service.service;

import org.springframework.http.ResponseEntity;

import com.clay.delivery_service.domain.Delivery;
import com.clay.delivery_service.models.DeliveryRequest;
import com.clay.delivery_service.models.DeliveryResponse;


public interface DeliveryService {

	public ResponseEntity<?> getAllDeliveries();

	public DeliveryResponse addDeliveries(DeliveryRequest deliveryRequest);

	public Delivery getDeliveryById(String id);

	public DeliveryResponse deleteDelivery(String id);

}
