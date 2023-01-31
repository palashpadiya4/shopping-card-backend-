package com.example.order_service.classes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product-details")
public class ProductDetails {

    @Id
    private long productId;
    private String productName;
    public ProductDetails() {
    }
    public ProductDetails(long productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
    public long getProductId() {
        return productId;
    }
    public void setProductId(long productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    @Override
    public String toString() {
        return "ProductDetails [productId=" + productId + ", productName=" + productName + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (productId ^ (productId >>> 32));
        result = prime * result + ((productName == null) ? 0 : productName.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductDetails other = (ProductDetails) obj;
        if (productId != other.productId)
            return false;
        if (productName == null) {
            if (other.productName != null)
                return false;
        } else if (!productName.equals(other.productName))
            return false;
        return true;
    }
 
    
    
}
