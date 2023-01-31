package com.microservices.orders.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.microservices.orders.model.Order;


public interface OrderService {
	
	
	public String addorder(  Order order );
	 public List<Order> fetchAllOrders();
	 public Order update(Order order);
	 public ResponseEntity<Object> deleteById(String id);


	void fetchById(String id);
}
