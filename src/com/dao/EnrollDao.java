package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Course;
import com.model.Enrollment;
import com.model.Student;

public interface EnrollDao {

	int save(Enrollment enrollment) throws SQLException;

	List<Course> getAllCourses()throws SQLException;

	Student getStudentWithEnrollments(int studentId)throws SQLException;

	List<Student> getAllStudents() throws SQLException;

}
