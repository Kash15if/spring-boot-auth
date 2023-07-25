package com.practice.myfirstapp;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // You can define custom queries here if needed
}
