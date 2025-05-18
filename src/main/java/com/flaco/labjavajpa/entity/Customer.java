package com.flaco.labjavajpa.entity;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private CustomerStatus status;

    private Integer totalMileage;

    public Customer() {
    }

    public Customer(String name, CustomerStatus status, Integer totalMileage) {
        this.name = name;
        this.status = status;
        this.totalMileage = totalMileage;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public Integer getTotalMileage() {
        return totalMileage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public void setTotalMileage(Integer totalMileage) {
        this.totalMileage = totalMileage;
    }
}