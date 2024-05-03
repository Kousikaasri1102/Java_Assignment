package com.service;

import java.util.List;
import com.dao.*;
import com.model.Student;

public class StudentService {
      StudentDao dao=new StudentDaoImpl();
	public List<Student> getAllStudents() {
		return dao.getAllAStudents();
	}

	public int addStudent(Student student) {
		return dao.addStudent(); 
	}

	
}
