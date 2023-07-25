package com.practice.myfirstapp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usersTab")
public class Customer {

    @Id
    private Long id;
     @Column(name = "first_name", nullable = false)
    private String first_name;
    @Column(name = "last_name", nullable = false)
    private String last_name;
    @Column(name = "address", nullable = false)
    private String address;

    


    // Constructors, getters, setters, etc.
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Customer(){}
    
    public Customer(Long id, String first_name, String last_name, String address) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
    }
    
    
    


    




}

