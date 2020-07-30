package com.trinity.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinity.demospring.entities.City;
import com.trinity.demospring.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
