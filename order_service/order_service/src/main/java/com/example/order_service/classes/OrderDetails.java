package com.example.order_service.classes;

import java.util.List;

import com.example.order_service.model.Product;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="order-details")
public class OrderDetails {

    @Id
    private int cartId;
    private AddressDetails addressDetails;
    private List<Product> products;
    
    
    public OrderDetails() {
    }


    public OrderDetails(int cartId, AddressDetails addressDetails, List<Product> products) {
        this.cartId = cartId;
        this.addressDetails = addressDetails;
        this.products = products;
    }


    public int getCartId() {
        return cartId;
    }


    public void setCartId(int cartId) {
        this.cartId = cartId;
    }


    public AddressDetails getAddressDetails() {
        return addressDetails;
    }


    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }


    public List<Product> getProducts() {
        return products;
    }


    public void setProducts(List<Product> products) {
        this.products = products;
    }


    @Override
    public String toString() {
        return "OrderDetails [addressDetails=" + addressDetails + ", cartId=" + cartId + ", products=" + products + "]";
    }
    
}
