package com.controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.exception.ResourceNotFoundException;
import com.model.Course;
import com.model.Enrollment;
import com.model.Student;
import com.service.EnrollService;

public class EnrollController {
public static void main(String[] args) {
	EnrollService enrollService=new EnrollService();
	Scanner sc = new Scanner(System.in);
	 while(true) {
			System.out.println("Enrollment Module");
			System.out.println("Press 1. Enroll course");
			System.out.println("Press 2. Display All course");
			System.out.println("Press 3. Display student with enrollment");
			System.out.println("Press 4. Display student with enrollment");
	       	System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting Enrollment Module..");
				break; 
			}
			switch(input) {
			case 1: 
				Random random=new Random();
				int randomNumber=random.nextInt();
				int enrollment_id=randomNumber<0?randomNumber*-1:randomNumber;
				System.out.println("Enter student_id");
				
				int student_id=sc.nextInt();
				System.out.println("Enter course_id");
				int course_id=sc.nextInt();
				
				LocalDate enrollmentDate = LocalDate.now();
				String enrollment_date = null;
				Enrollment enrollment=new Enrollment(enrollment_id,student_id,course_id,enrollment_date);
				try {
					int status=enrollService.insert(enrollment);
					if(status==1)
						System.out.println("Agency record added to DB..");
					else
						System.out.println("Insert operation failed..");
					
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
			    try {
			        List<Course> courses = enrollService.getAllCourses();
			        System.out.println("List of Courses:");
			        for (Course course : courses) {
			            System.out.println(course); // Assuming Course class has a toString() method
			        }
			    } catch (SQLException e) {
			        System.out.println("Failed to retrieve courses: " + e.getMessage());
			    }
			    break;
			case 3:
			    try {
			        List<Student> studentsWithEnrollments = enrollService.getStudentsWithEnrollments();
			        System.out.println("Students with Enrollments:");
			        for (Student student : studentsWithEnrollments) {
			            System.out.println(student); // Assuming Student class has a toString() method
			            List<Course> enrolledCourses = student.getEnrolledCourses();
			            for (Course course : enrolledCourses) {
			                System.out.println("- " + course.getCourseName());
			            }
			            System.out.println(); // Empty line for separation
			        }
			    } catch (SQLException e) {
			        System.out.println("Failed to retrieve students with enrollments: " + e.getMessage());
			    }
			    break;
			case 4:
			    System.out.println("Enter student_id:");
			    int studentId = sc.nextInt();
			    try {
			        Student student = enrollService.getStudentWithEnrollments(studentId);
			        if (student != null) {
			            System.out.println("Student: " + student); // Assuming Student class has a toString() method
			            List<Course> enrolledCourses = student.getEnrolledCourses();
			            System.out.println("Enrolled Courses:");
			            for (Course course : enrolledCourses) {
			                System.out.println("- " + course.getCourseName());
			            }
			        } else {
			            System.out.println("Student with ID " + studentId + " not found.");
			        }
			    } catch (SQLException e) {
			        System.out.println("Failed to retrieve student with enrollments: " + e.getMessage());
			    }
			    break;



	 }
	 }
}public static void enrollMenu(){
	 String[] ref= {""};
	 main(ref);
}
}
