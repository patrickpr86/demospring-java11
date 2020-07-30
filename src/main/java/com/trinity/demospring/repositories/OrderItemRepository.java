package com.trinity.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinity.demospring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
