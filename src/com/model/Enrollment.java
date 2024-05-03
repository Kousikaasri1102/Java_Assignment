package com.model;

public class Enrollment {
	private int enrollmentId;
	private int studentId;
	private int courseId;
	private String enrollment_date;
	public Enrollment(int enrollmentId, int studentId, int courseId, String enrollment_date) {
		super();
		this.enrollmentId = enrollmentId;
		this.studentId = studentId;
		this.courseId = courseId;
		this.enrollment_date = enrollment_date;
	}
	public int getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getEnrollment_date() {
		return enrollment_date;
	}
	public void setEnrollment_date(String enrollment_date) {
		this.enrollment_date = enrollment_date;
	}
	@Override
	public String toString() {
		return "Enrollment [enrollmentId=" + enrollmentId + ", studentId=" + studentId + ", courseId=" + courseId
				+ ", enrollment_date=" + enrollment_date + "]";
	}
	
	
}
