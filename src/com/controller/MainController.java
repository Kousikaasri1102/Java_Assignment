package com.controller;

import java.util.Scanner;


public class MainController {
public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
	         while (true) {
	                System.out.println("Press 1. Student Menu");
	                System.out.println("Press 2. Teacher Menu");
	                System.out.println("Press 3. Payment Menu");
	                System.out.println("Press 4. Enrollment Menu");
	                System.out.println("Press 5. Course Menu");
		            System.out.println("Press 0. Logout");
	            
	                int input = sc.nextInt();
	                sc.nextLine();
	                
	                if(input == 0 ) break;
	                switch (input) {
	                
                   case 1:
                   	   System.out.println("Student Menu");
                   	   StudentController.studentMenu(); 
                       break;
                  
                   case 2:
                   	 System.out.println("Teacher Menu");
                   	 TeacherController.teacherMenu();
                   	 break;
                   case 3:
                   	System.out.println(" Payment Menu");
                   	PaymentController.paymentMenu();
                   	break;
                   case 4:
                     	 System.out.println("Enrollment Menu");
                     	 EnrollController.enrollMenu();
                     	 break;
                   case 5:
                     	 System.out.println("Course Menu");
                     	 CourseController.courseMenu();
                     	 break;
                   	
	        } 
	    }
	         
	sc.close();
}

}


