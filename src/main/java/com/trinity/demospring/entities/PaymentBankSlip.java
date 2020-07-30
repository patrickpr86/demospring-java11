package com.trinity.demospring.entities;

import java.time.Instant;

import javax.persistence.Entity;

import com.trinity.demospring.entities.enums.PaymentState;

@Entity
public class PaymentBankSlip extends Payment{ //Pagamento com Boleto bancário
	private static final long serialVersionUID = 1L;

	
	private Instant dueDate; //data vencimento
	private Instant paymentDate; //data pagamento
	
	public PaymentBankSlip() {
		
	}

	public PaymentBankSlip(Long id, PaymentState paymentState, Order order, Instant dueDate, Instant paymentDate ) {
		super(id, paymentState, order);
		this.paymentDate = paymentDate;
		this.dueDate = dueDate;
	}

	public Instant getDueDate() {
		return dueDate;
	}

	public void setDueDate(Instant dueDate) {
		this.dueDate = dueDate;
	}

	public Instant getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Instant paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	



}
