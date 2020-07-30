package com.trinity.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinity.demospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
