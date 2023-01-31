package com.example.order_service.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {

    @Id
    private long orderId;
    private List<Product> products;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate orderDate;
    private Address address;
    private double amountPaid;
    private String modeOfPayment;
    private String orderStatus;
    private int qty;

    public Order() {
    }

    public Order(long orderId, List<Product> products, LocalDate orderDate, Address address, double amountPaid,
            String modeOfPayment, String orderStatus, int qty) {
        this.orderId = orderId;
        this.products = products;
        this.orderDate = orderDate;
        this.address = address;
        this.amountPaid = amountPaid;
        this.modeOfPayment = modeOfPayment;
        this.orderStatus = orderStatus;
        this.qty = qty;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        long temp;
        temp = Double.doubleToLongBits(amountPaid);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((modeOfPayment == null) ? 0 : modeOfPayment.hashCode());
        result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
        result = prime * result + (int) (orderId ^ (orderId >>> 32));
        result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
        result = prime * result + ((products == null) ? 0 : products.hashCode());
        result = prime * result + qty;
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
        Order other = (Order) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (Double.doubleToLongBits(amountPaid) != Double.doubleToLongBits(other.amountPaid))
            return false;
        if (modeOfPayment == null) {
            if (other.modeOfPayment != null)
                return false;
        } else if (!modeOfPayment.equals(other.modeOfPayment))
            return false;
        if (orderDate == null) {
            if (other.orderDate != null)
                return false;
        } else if (!orderDate.equals(other.orderDate))
            return false;
        if (orderId != other.orderId)
            return false;
        if (orderStatus == null) {
            if (other.orderStatus != null)
                return false;
        } else if (!orderStatus.equals(other.orderStatus))
            return false;
        if (products == null) {
            if (other.products != null)
                return false;
        } else if (!products.equals(other.products))
            return false;
        if (qty != other.qty)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Order [address=" + address + ", amountPaid=" + amountPaid + ", modeOfPayment=" + modeOfPayment
                + ", orderDate=" + orderDate + ", orderId=" + orderId + ", orderStatus=" + orderStatus + ", products="
                + products + ", qty=" + qty + "]";
    }

}
