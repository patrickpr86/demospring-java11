package com.trinity.demospring.entities;

import javax.persistence.Entity;

import com.trinity.demospring.entities.enums.PaymentState;

@Entity
public class PaymentByCard extends Payment { //Pagamento com cartão
	private static final long serialVersionUID = 1L;

	
	private Integer numberOfInstallments; //Número de parcelas
	
	public PaymentByCard() {
		
	}

	public PaymentByCard(Long id, PaymentState paymentState, Order order, Integer numberOfInstallments) {
		super(id, paymentState, order);
		this.numberOfInstallments = numberOfInstallments;
	}

	public Integer getNumberOfInstallments() {
		return numberOfInstallments;
	}

	public void setNumberOfInstallments(Integer numberOfInstallments) {
		this.numberOfInstallments = numberOfInstallments;
	}
	
	

}
