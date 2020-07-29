package com.trinity.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinity.demospring.entities.City;

public interface CityRepository extends JpaRepository<City, Long>{

}
