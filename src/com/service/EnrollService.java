package com.service;

import com.model.Course;
import com.model.Enrollment;
import com.model.Student;

import java.sql.SQLException;
import java.util.List;

import com.dao.*;
public class EnrollService {
     EnrollDao dao=new EnrollDaoImpl();
     public int insert(Enrollment enrollment) throws SQLException {
         return dao.save(enrollment);
     }

     public List<Course> getAllCourses() throws SQLException {
         return dao.getAllCourses();
     }

     public Student getStudentWithEnrollments(int studentId) throws SQLException {
         return dao.getStudentWithEnrollments(studentId);
     }

	public List<Student> getStudentsWithEnrollments() throws SQLException {
		return dao.getAllStudents();
	}
	

}
