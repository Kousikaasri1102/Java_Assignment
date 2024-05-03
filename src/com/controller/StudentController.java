package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.model.Student;
import com.service.StudentService;

public class StudentController {
public static void main(String[] args) {
	StudentService studentService=new StudentService();
	Scanner sc = new Scanner(System.in);
	 while(true) {
			System.out.println("Student Module");
			System.out.println("Press 1. Add Student");
			System.out.println("Press 2. List student");
			
	       	System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting Course Module..");
				break; 
			}
			switch (input) {
            case 1:
                // Add Student
                System.out.println("Enter Student Details:");
                System.out.println("First Name:");
                String firstName = sc.nextLine();
                System.out.println("Last Name:");
                String lastName = sc.nextLine();
                System.out.println("Date of Birth (YYYY-MM-DD):");
                String dateOfBirth = sc.nextLine();
                System.out.println("Email:");
                String email = sc.nextLine();
                System.out.println("Phone Number:");
                String phoneNumber = sc.nextLine();

                // Create Student object and add to database
				Student student = new Student(firstName, lastName, dateOfBirth, email, phoneNumber);
				int studentId = studentService.addStudent(student);
				System.out.println("Student added successfully with ID: " + studentId);
                break;

            case 2:
                List<Student> students = studentService.getAllStudents();
				System.out.println("List of Students:");
				for (Student student1 : students) {
				    System.out.println("ID: " + student1.getStudentId() +
				            ", Name: " + student1.getFirstName() + " " + student1.getLastName() +
				            ", Date of Birth: " + student1.getDateOfBirth() +
				            ", Email: " + student1.getEmail() +
				            ", Phone Number: " + student1.getPhoneNumber());
				}
                break;
			}
	 }
}public static void studentMenu(){
	 String[] ref= {""};
	 main(ref);
}
}
