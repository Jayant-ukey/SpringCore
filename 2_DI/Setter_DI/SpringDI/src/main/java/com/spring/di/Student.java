package com.spring.di;

public class Student {

	private int id;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayStudentInformation() {
		System.out.println("Name of student : "+this.name 
								 +", and id : "+this.id);
	}
}
