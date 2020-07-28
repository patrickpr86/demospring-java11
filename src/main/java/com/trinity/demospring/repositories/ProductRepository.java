package com.trinity.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinity.demospring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
