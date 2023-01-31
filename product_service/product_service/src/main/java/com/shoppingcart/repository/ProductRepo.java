package com.shoppingcart.repository;

import com.shoppingcart.model.Product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends MongoRepository<Product,Long>{


    
}
