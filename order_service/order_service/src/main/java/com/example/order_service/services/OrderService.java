package com.example.order_service.services;

import java.util.List;

import com.example.order_service.model.Order;

public interface OrderService {

    public List<Order> getAllOrders();
    public Order getAllOrderById(long orderId);

    public Order setOrderDetails(Order order);

    public Order updateOrderById(Order order);

    public void deleteOrderById(long orderId);
    
}




