package com.trinity.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinity.demospring.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
