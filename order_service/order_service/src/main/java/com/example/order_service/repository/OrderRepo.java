package com.example.order_service.repository;

import com.example.order_service.model.Order;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepo extends MongoRepository<Order,Long>{

    
}
