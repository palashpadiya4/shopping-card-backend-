package com.example.order_service.controller;

import java.util.Optional;

import com.example.order_service.model.Order;
import com.example.order_service.repository.OrderRepo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private OrderRepo repo;

    @Autowired
    public OrderController(OrderRepo repo) {
        this.repo = repo;
    }

    @PostMapping("/api/orders")
    @Operation(description = "Add Order")
    @ApiResponse(responseCode = "200" , description = "Order added successfully")
    @ApiResponse(responseCode = "400" , description = "Bad Request: Something went wrong")
    public Order createOrder(@RequestBody Order order) {
        return repo.save(order);
    }

    @GetMapping("/api/orders/{id}")
    @Operation(description = "Get Product")
    @ApiResponse(responseCode = "200" , description = "Product fetched successfully")
    @ApiResponse(responseCode = "400" , description = "Bad Request: Occurs when product isn't fetched!!")
    public Optional<Order> findOrderById(@PathVariable Long id) {
        return repo.findById(id);
    }

}
