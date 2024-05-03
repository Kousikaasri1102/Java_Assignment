package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Course;
import com.model.Enrollment;

import com.model.Student;
import com.utility.DBConnection;

public class EnrollDaoImpl implements EnrollDao{

	@Override
	public int save(Enrollment enrollment) throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="INSERT INTO enrollment(enrollment_id,student_id,course_id,enrollment_date) VALUES (?,?,?,?)";
		PreparedStatement pstmt= con.prepareStatement(sql);
		pstmt.setInt(1, enrollment.getEnrollmentId());
		pstmt.setInt(2, enrollment.getStudentId());
		pstmt.setInt(3, enrollment.getCourseId());
		pstmt.setString(4, enrollment.getEnrollment_date());
		
		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}

	@Override
	public List<Course> getAllCourses() throws SQLException {
		Connection con = DBConnection.dbConnect();
	    String sql = "SELECT * FROM course";
	    PreparedStatement pstmt = con.prepareStatement(sql);
	    
	    ResultSet rst = pstmt.executeQuery();
	    List<Course> List = new ArrayList<>();
	    while (rst.next()) {
            int courseId = rst.getInt("course_id");
            String courseName = rst.getString("course_name");
            String courseCode = rst.getString("course_code");
            String instructorName = rst.getString("instructor_name");

            Course course = new Course(courseId, courseName, courseCode, instructorName);
            List.add(course);
        }
	    DBConnection.dbClose();
	    return List;
	}

	@Override
	public Student getStudentWithEnrollments(int studentId) throws SQLException {
	    
	    
	    ResultSet rs = null;
	    Student student = null;

	    try {
	    	Connection con = DBConnection.dbConnect();
	    	String sql = "SELECT * FROM student WHERE student_id = ?";
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	        
	        
	        pstmt.setInt(1, studentId);
	        rs = pstmt.executeQuery();

	        if (rs.next()) {
	            String firstName = rs.getString("first_name");
	            String lastName = rs.getString("last_name");
	            String dateOfBirth = rs.getString("date_of_birth");
	            String email = rs.getString("email");
	            String phoneNumber = rs.getString("phone_number");

	            student = new Student(studentId, firstName, lastName, dateOfBirth, email, phoneNumber);

	            // Retrieve enrollments for the student
	            List<Enrollment> enrollments = new ArrayList<>();
	            sql = "SELECT * FROM enrollment WHERE student_id = ?";
	            pstmt = con.prepareStatement(sql);
	            pstmt.setInt(1, studentId);
	            rs = pstmt.executeQuery();

	            while (rs.next()) {
	                int enrollmentId = rs.getInt("enrollment_id");
	                int courseId = rs.getInt("course_id");
	                String enrollmentDate = rs.getString("enrollment_date");

	                Enrollment enrollment = new Enrollment(enrollmentId, studentId, courseId, enrollmentDate);
	                enrollments.add(enrollment);
	            }

	            // Set the enrollments for the student
	            student.setEnrollments(enrollments);
	        }
	    } finally {
	        DBConnection.dbClose();
	    }

	    return student;
	}

	@Override
	public List<Student> getAllStudents() throws SQLException {
	    
	    
	    ResultSet rs = null;
	    List<Student> students = new ArrayList<>();

	    try {
	    	Connection con = DBConnection.dbConnect();
	    	 String sql = "SELECT * FROM student";
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	       
	       
	        rs = pstmt.executeQuery();

	        while (rs.next()) {
	            int studentId = rs.getInt("student_id");
	            String firstName = rs.getString("first_name");
	            String lastName = rs.getString("last_name");
	            String dateOfBirth = rs.getString("date_of_birth");
	            String email = rs.getString("email");
	            String phoneNumber = rs.getString("phone_number");

	            Student student = new Student(studentId, firstName, lastName, dateOfBirth, email, phoneNumber);
	            students.add(student);
	        }
	    } finally {
	        DBConnection.dbClose();
	    }

	    return students;
	}

}
