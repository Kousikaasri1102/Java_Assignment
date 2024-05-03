package com.exception;

public class InvalidCourseDataException extends Exception{
	private String message;
    
    public InvalidCourseDataException(String message) {
    	this.message=message;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
