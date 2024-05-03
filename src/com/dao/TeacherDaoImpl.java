package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Teacher;
import com.utility.DBConnection;

public class TeacherDaoImpl implements TeacherDao{

	@Override
	public List<Teacher> getAllTeachers() {
		List<Teacher> teachers = new ArrayList<>();
		Connection con = DBConnection.dbConnect();
		
        ResultSet resultSet = null;

        try {
            
            String sql = "SELECT * FROM teachers";
            PreparedStatement pstmt = con.prepareStatement(sql);
            resultSet = pstmt.executeQuery();

            while (resultSet.next()) {
                int teacherId = resultSet.getInt("teacher_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");

                Teacher teacher = new Teacher(teacherId, firstName, lastName, email);
                teachers.add(teacher);
            }
        } finally {

        return teachers;
	}

}
}
