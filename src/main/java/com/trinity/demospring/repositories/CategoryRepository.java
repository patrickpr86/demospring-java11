package com.trinity.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinity.demospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
