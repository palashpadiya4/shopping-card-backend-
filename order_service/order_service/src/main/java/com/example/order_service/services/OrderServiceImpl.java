package com.example.order_service.services;

import java.util.List;

import com.example.order_service.model.Order;
import com.example.order_service.repository.OrderRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepo orderRepo;


    @Override
    public List<Order> getAllOrders() {
       
        return orderRepo.findAll();
    }

    @Override
    public Order getAllOrderById(long orderId) {
       
        return orderRepo.findById(orderId).get();
    }

    @Override
    public Order setOrderDetails(Order order) {
        
        return orderRepo.save(order);
    }

    @Override
    public Order updateOrderById(Order order) {
        
        return orderRepo.save(order);
    }

    @Override
    public void deleteOrderById(long orderId) {
        
        orderRepo.deleteById(orderId);
    }

    
}
