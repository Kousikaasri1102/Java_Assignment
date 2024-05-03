package com.exception;

public class TeacherNotFoundException extends Exception{
	private String message;
    
    public TeacherNotFoundException(String message) {
    	this.message=message;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	} 

}
