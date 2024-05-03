package com.model;

public class Teacher {
	private int teacherId;
    private String firstName;
    private String lastName;
    private String email;
	public Teacher(String firstName, String lastName, String email) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public Teacher(int teacherId2, String firstName2, String lastName2, String email2) {
		// TODO Auto-generated constructor stub
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
    
    
}
