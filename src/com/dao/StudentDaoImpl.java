package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;
import com.utility.DBConnection;

public class StudentDaoImpl implements StudentDao{

	@Override
	public List<Student> getAllAStudents() {
		 List<Student> students = new ArrayList<>();
	  
	     Connection con = DBConnection.dbConnect();
	            String sql = "SELECT * FROM students";
	            PreparedStatement pstmt = con.prepareStatement(sql);
	            resultSet  r= pstmt.executeQuery();

	            while (r.next()) {
	                int studentId = r.getInt("student_id");
	                String firstName = r.getString("first_name");
	                String lastName = r.getString("last_name");
	                String dateOfBirth = r.getString("date_of_birth");
	                String email = r.getString("email");
	                String phoneNumber = r.getString("phone_number");

	                Student student = new Student(studentId, firstName, lastName, dateOfBirth, email, phoneNumber);
	                students.add(student);
	            }
	}

	        return students;
	    }
}


	private List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addStudent() {
		
        int rows = 0;
        Connection con = DBConnection.dbConnect();
       
          
            String sql = "INSERT INTO students (first_name, last_name, date_of_birth, email, phone_number) " +
                         "VALUES (?, ?, ?, ?, ?)";
        	PreparedStatement pstmt = con.prepareStatement(sql);
        	pstmt = con.prepareStatement(sql);
            Student student;
            pstmt.setString(1, student.getFirstName());
            pstmt.setString(2, student.getLastName());
            pstmt.setString(3, student.getDateOfBirth());
            pstmt.setString(4, student.getEmail());
            pstmt.setString(5, student.getPhoneNumber());

            rows = pstmt.executeUpdate();
         

        return rows;
    }

}
