package com.model;

public class Payment {
	private int paymentId;
    private int studentId;
    private double amount;
    private String paymentDate;
	public Payment(int paymentId, int studentId, double amount, String paymentDate) {
		super();
		this.paymentId = paymentId;
		this.studentId = studentId;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", studentId=" + studentId + ", amount=" + amount + ", paymentDate="
				+ paymentDate + "]";
	}
    
    
}
