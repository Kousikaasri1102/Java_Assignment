package com.service;

import java.util.List;
import com.model.Teacher;
import com.dao.*;
public class TeacherService {
  TeacherDao dao=new TeacherDaoImpl();
	public List<Teacher> getAllTeachers() {
		return dao.getAllTeachers();
	}

	public int addTeacher() {
		// TODO Auto-generated method stub
		return addTeacher();
	}

}
