package com.microservices.orders;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.microservices.orders.repositories.OrderRepository;
import com.microservices.orders.services.OrderService;

@RunWith (SpringRunner.class)
@SpringBootTest
class OrderServiceApplicationTests {
	@Autowired
	OrderService service;

	@MockBean
	OrderRepository repository;

	@Test
	public void fetchAllOrders()
	{

	}

}
