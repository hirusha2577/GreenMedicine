package com.clay.payment_service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clay.payment_service.dao.CartRepository;
import com.clay.payment_service.domain.Cart;
import com.clay.payment_service.models.PaymentRequest;
import com.clay.payment_service.service.PaymentService;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api/payment")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@Autowired
	private CartRepository cartRepository;
	
	@PostMapping
	public ResponseEntity<?> addPayment(@RequestBody PaymentRequest paymentRequest) {
		
		Optional<Cart> cart = cartRepository.findById(paymentRequest.getCartId());
		
		if(cart.isPresent()) {
			Cart newCart = cart.get();
			
			paymentService.addPayment(newCart, paymentRequest);
		}
		return null;
	}
	
}
