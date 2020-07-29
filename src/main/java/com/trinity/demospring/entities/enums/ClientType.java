package com.trinity.demospring.entities.enums;

public enum ClientType {
	
	PHYSICALPERSON(1, "Physical Person"),
	LEGALPERSON(2, "Legal Person");
	
	private Integer code;
	private String description;
	
	
	private ClientType(Integer code, String description) {
		this.code = code;
		this.description = description;
		
	}
	
	public Integer getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public static ClientType toEnum(int code) {
		for(ClientType value : ClientType.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid ClientType code: " + code);
	}
}
