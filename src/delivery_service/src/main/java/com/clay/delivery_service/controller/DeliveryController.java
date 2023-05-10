package com.clay.delivery_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clay.delivery_service.domain.Delivery;
import com.clay.delivery_service.models.DeliveryRequest;
import com.clay.delivery_service.models.DeliveryResponse;
import com.clay.delivery_service.service.DeliveryService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/delivery")
public class DeliveryController {
	
	@Autowired
	private DeliveryService deliveryDervice;

	@GetMapping
	public ResponseEntity<?> getDeliveryList() {
		return deliveryDervice.getAllDeliveries();
	}
	
	@PostMapping
	public ResponseEntity<?> addDeliveries(@RequestBody DeliveryRequest deliveryRequest){
		
		DeliveryResponse response = deliveryDervice.addDeliveries(deliveryRequest);
		
		if(response.getStatusCode().equalsIgnoreCase("000")) {
			return new ResponseEntity<DeliveryResponse>(response, HttpStatus.OK);
			
		} else {
			return new ResponseEntity<DeliveryResponse>(response, HttpStatus.BAD_GATEWAY);
		}
		 
	}
	
	@GetMapping(value = "/{id}")
	public Delivery getDeliveryByID(@PathVariable String id) {
		
		Delivery delivery = deliveryDervice.getDeliveryById(id);
		
		return delivery;
	}
	
	@DeleteMapping(value = "/{deliveryId}")
	public ResponseEntity<?> deleteDeliveryByID(@PathVariable String id) {
		
		DeliveryResponse response = deliveryDervice.deleteDelivery(id);
		
		if(response.getStatusCode().equalsIgnoreCase("000")) {
			return new ResponseEntity<DeliveryResponse>(response, HttpStatus.OK);
			
		} else {
			return new ResponseEntity<DeliveryResponse>(response, HttpStatus.BAD_GATEWAY);
		}
		
	}
	
	
}
