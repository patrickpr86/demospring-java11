package com.trinity.demospring.resources.exception;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> list = new ArrayList<>();
	
	public ValidationError(Integer status, String message, Long timeStamp) {
		super();
	}
	
	
	public ValidationError(Instant now, int value, String error, String message, String requestURI) {
		super();
	}


	public List<FieldMessage> getList(){
		return list;
	}
	
	public void addError(String fieldName, String message) {
		list.add(new FieldMessage(fieldName, message));
	}

}
