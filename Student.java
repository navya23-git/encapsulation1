package com.student;
import com.school.School;

public class Student {
	private String studentName;
	private String grade;
	private School school;
	private double averageMarks;

	private Student(String studentName, String grade, School school, double averageMarks) {
		this.studentName = studentName;
		this.grade = grade;
		this.school = school;
		this.averageMarks = averageMarks;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentGrade() {
		return grade;
	}

	public School getSchool() {
		return school;
	}

	public double getAverageMarks() {
		return averageMarks;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentGrade(String grade) {
		this.grade = grade;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public void setAverageMarks(double averageMarks) {
		this.averageMarks = averageMarks;
	}
	public String toString() {
		return "name:"+studentName+"\ngrade:"+grade+"\nschool:"+school+"\naverageMarks:"+averageMarks;
	}

	public static Student getStudentObject(String studentName, String grade, School school, double averageMarks) {
		if(averageMarks <0||averageMarks >100) {
			return null;
		}
		return new Student(studentName, grade, school, averageMarks);
	}
	
	
}
