package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.model.Teacher;
import com.service.TeacherService;

public class TeacherController {
public static void main(String[] args) {
	TeacherService teacherService=new TeacherService();
	Scanner sc = new Scanner(System.in);
	 while(true) {
			System.out.println("Teacher Module");
			System.out.println("Press 1. List Teachers");
			System.out.println("Press 2. Add Teachers");
			
	       	System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting Teachers Module..");
				break; 
			}
			switch (input) {
            case 1:
                List<Teacher> teachers = teacherService.getAllTeachers();
				System.out.println("List of Teachers:");
				for (Teacher teacher : teachers) {
				    System.out.println("ID: " + teacher.getTeacherId() +
				            ", Name: " + teacher.getFirstName() + " " + teacher.getLastName() +
				            ", Email: " + teacher.getEmail());
				}
                break;

            case 2:
                // Add Teacher
                System.out.println("Enter Teacher Details:");
                System.out.println("First Name:");
                String firstName = sc.nextLine();
                System.out.println("Last Name:");
                String lastName = sc.nextLine();
                System.out.println("Email:");
                String email = sc.nextLine();

                // Create Teacher object and add to database
				Teacher teacher = new Teacher(firstName, lastName, email);
				int teacherId = teacherService.addTeacher();
				System.out.println("Teacher added successfully with ID: " + teacherId);
                break;
	 }
	 }
}public static void teacherMenu(){
	 String[] ref= {""};
	 main(ref);
}
}
