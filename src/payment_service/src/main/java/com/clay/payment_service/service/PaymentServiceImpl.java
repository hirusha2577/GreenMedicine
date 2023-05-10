package com.clay.payment_service.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.clay.payment_service.dao.TransactionHeaderRepository;
import com.clay.payment_service.dao.UserRepository;
import com.clay.payment_service.domain.Cart;
import com.clay.payment_service.domain.Product;
import com.clay.payment_service.domain.TransactionHeader;
import com.clay.payment_service.domain.User;
import com.clay.payment_service.models.PaymentRequest;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TransactionHeaderRepository transactionHeaderRepository;

	@Override
	public ResponseEntity<?> addPayment(Cart newCart, PaymentRequest paymentRequest) {
		
		Optional<User> user = userRepository.findById(newCart.getUserId());
		
		float orderFee = 0;
		List<Product> products = new ArrayList<>();
		
		for(Product product : paymentRequest.getProducts()) {
			
			orderFee = product.getPrice() * (float)product.getQuantity();
			
			Product product2 = new Product();
			product2.setCategoryId(product.getCategoryId());
			product2.setImageUrl(product.getImageUrl());
			product2.setPrice(product.getPrice());
			product2.setProductTitle(product.getProductTitle());
			product2.setQuantity(product.getQuantity());
			
			products.add(product2);
			
		}
		
		TransactionHeader header = new TransactionHeader();
		header.setCreatedDate(new Date());
		header.setFromAccount(paymentRequest.getAccountNumber());
		header.setModifiedDate(new Date());
		header.setStatus("A");
		header.setTotalPrice(orderFee);
		header.setUserId(user.get().getId());
		
		transactionHeaderRepository.save(header);
		
		paymentRequest.setOrderDescription("Order was placed on " + new Date());
		paymentRequest.setOrderFee(orderFee);
		paymentRequest.setProducts(products);
		paymentRequest.setUserInfo(user.get());
		
		try {
			
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return null;
		
	}

	
}
