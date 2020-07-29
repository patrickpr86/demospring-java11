package com.trinity.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinity.demospring.entities.State;

public interface StateRepository extends JpaRepository<State, Long>{

}
