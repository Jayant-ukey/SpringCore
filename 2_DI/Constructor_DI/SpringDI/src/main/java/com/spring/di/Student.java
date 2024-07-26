package com.spring.di;

public class Student {

	private int id;
	private String name;
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public Student(int id) {
		this.id = id;
	}

	public void displayStudentInformation() {
		System.out.println("Name of student : "+this.name 
								 +", and id : "+this.id);
	}
}
