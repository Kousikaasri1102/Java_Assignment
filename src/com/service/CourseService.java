package com.service;
import com.dao.*;
public class CourseService {
    CourseDao dao=new CourseDaoImpl();
	public int addCourse(String courseName, String courseCode, String instructorName) {
		return dao.addCourse();
	}

	public Iterable<Throwable> getAllCourses() {
		return dao.getAllCourses();
	}

}
