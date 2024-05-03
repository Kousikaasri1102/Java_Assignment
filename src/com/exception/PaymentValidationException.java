package com.exception;

public class PaymentValidationException extends Exception{
	private String message;
    
    public PaymentValidationException(String message) {
    	this.message=message;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	} 

}
