package com.example.order_service;

import java.util.ArrayList;
import java.util.List;

import com.example.order_service.model.Order;
import com.example.order_service.repository.OrderRepo;
import com.example.order_service.services.OrderServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class OrderServiceApplicationTests {

	List<Order> orders = new ArrayList<>();
	Order order;
	Order order1;

	@Autowired
	private OrderServiceImpl orderserviceImpl;

	@MockBean
	private OrderRepo orderRepo;

	
	


}
