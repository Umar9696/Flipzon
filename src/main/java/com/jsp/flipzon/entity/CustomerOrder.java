package com.jsp.flipzon.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Entity
public class CustomerOrder {

    @Id
    private String id;

    private double totalAmount;

    @UpdateTimestamp
    private LocalDateTime creationTime;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Item> items;

    private String paymentId;

    @ManyToOne
    private Customer customer;

    // --- Getters and Setters ---

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
