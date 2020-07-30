package com.trinity.demospring.entities.enums;

public enum PaymentState {
	
	WAITING_PAYMENT(1, "Waitting Payment"),
	PAID(2, "Paid"),
	CANCELD(3, "Canceld");
	
	private Integer code;
	private String description;
	
	
	private PaymentState(Integer code, String description) {
		this.code = code;
		this.description = description;
		
	}
	
	public Integer getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public static PaymentState toEnum(int code) {
		for(PaymentState value : PaymentState.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid PaymentState code: " + code);
	}

	
}
