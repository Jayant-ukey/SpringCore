package com.seleniumexpress.propertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	/*
	 * Here we are using annotation before dependencies, so we don't need constructor or setter.
	 */
	@Value("${student.name}")
	private String name;
	
	@Value("${student.course}")
	private String course;
	
	@Value("${student.hobby}")
	private String hobby;
	
	
//	@Required annotation is deprecated from spring 5.1
	
	public void displayStudentInfo() {
		System.out.println("Student name : "+name);
		System.out.println("Enrolled course name : "+course);
		System.out.println("Student hobby : "+hobby);
	}
}
