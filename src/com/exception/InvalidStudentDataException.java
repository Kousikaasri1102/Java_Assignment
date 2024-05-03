package com.exception;

public class InvalidStudentDataException extends Exception{
	private String message;
    
    public InvalidStudentDataException(String message) {
    	this.message=message;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	} 

}
