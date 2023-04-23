package com.clay.paymentservice.service;

import org.springframework.http.ResponseEntity;

import com.clay.paymentservice.domain.Cart;
import com.clay.paymentservice.models.PaymentRequest;

public interface PaymentService {

	public ResponseEntity<?> addPayment(Cart newCart, PaymentRequest paymentRequest);

}
