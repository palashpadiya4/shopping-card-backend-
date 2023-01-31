package com.shoppingcart.services;

import java.util.List;

import com.shoppingcart.model.Product;
import com.shoppingcart.repository.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {

        return productRepo.findAll();
    }

    @Override
    public Product getAllProductById(long productId) {

        return productRepo.findById(productId).get();
    }

    @Override
    public Product setProductDetails(Product product) {

        return productRepo.save(product);
    }

    @Override
    public Product updateProductById(Product product) {

        return productRepo.save(product);
    }

    @Override
    public void deleteProductById(long productId) {
        productRepo.deleteById(productId);

    }

}
