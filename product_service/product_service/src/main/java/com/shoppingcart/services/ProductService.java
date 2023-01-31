package com.shoppingcart.services;

import java.util.List;

import com.shoppingcart.model.Product;


public interface ProductService  {
    public List<Product> getAllProducts();

    public Product getAllProductById(long productId);

    public Product setProductDetails(Product product);

    public Product updateProductById(Product product);

    public void deleteProductById(long productId);


    
}
