package com.seleniumexpress.propertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	private String name;
	private String course;
	private String hobby;
	
	
//	@Required annotation is deprecated from spring 5.1
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("${student.course}")
	public void setCourse(String course) {
		this.course = course;
	}
	
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name : "+name);
		System.out.println("Enrolled course name : "+course);
		System.out.println("Student hobby : "+hobby);
	}
}
