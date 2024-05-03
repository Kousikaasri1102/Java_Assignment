package com.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.service.PaymentService;

public class PaymentController {
public static void main(String[] args) {
	PaymentService paymentService=new PaymentService();
	Scanner sc = new Scanner(System.in);
	 while(true) {
			System.out.println("Payment Module");
			System.out.println("Press 1. Show Payments");
			
	       	System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting payment Module..");
				break; 
			}
			 switch (input) {
             case 1:
                 System.out.println("Payments:");
				 paymentService.getAllPayments();
                 break;

             default:
                 System.out.println("Invalid input. Please try again.");
                 break;
	 }
	 }
}public static void paymentMenu(){
	 String[] ref= {""};
	 main(ref);
}
}
