package com.trinity.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinity.demospring.entities.Adress;

public interface AdressRepository extends JpaRepository<Adress, Long>{

}
