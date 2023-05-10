package com.clay.payment_service.service;

import org.springframework.http.ResponseEntity;

import com.clay.payment_service.domain.Cart;
import com.clay.payment_service.models.PaymentRequest;

public interface PaymentService {

	public ResponseEntity<?> addPayment(Cart newCart, PaymentRequest paymentRequest);

}
