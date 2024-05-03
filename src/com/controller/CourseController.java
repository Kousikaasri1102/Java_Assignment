package com.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.service.CourseService;
import com.service.EnrollService;

public class CourseController {
public static void main(String[] args) {
	CourseService courseService=new CourseService();
	Scanner sc = new Scanner(System.in);
	 while(true) {
			System.out.println("Course Module");
			System.out.println("Press 1. List Course");
			System.out.println("Press 2. Add Course");
			
	       	System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting Course Module..");
				break; 
			}
			switch (input) {
            case 1:
                System.out.println("List of Courses:");
				courseService.getAllCourses();
                break;

            case 2:
                System.out.println("Enter Course Name:");
                String courseName = sc.nextLine();
                System.out.println("Enter Course Code:");
                String courseCode = sc.nextLine();
                System.out.println("Enter Instructor Name:");
                String instructorName = sc.nextLine();

                int courseId = courseService.addCourse(courseName, courseCode, instructorName);
				System.out.println("Course added successfully with ID: " + courseId);
                break;
	 }
	 }		
}
public static void courseMenu(){
	 String[] ref= {""};
	 main(ref);
}
}
