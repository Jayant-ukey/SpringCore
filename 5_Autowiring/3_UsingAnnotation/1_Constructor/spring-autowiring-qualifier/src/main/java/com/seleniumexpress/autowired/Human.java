package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;
	
	/*
	 * Here we are making default constructor. Because below we override it using
	 * parameterized constructor. So JVM will not create default constructor for
	 * you. You will need to define it by yourself
	 */
	public Human() {
	}
	
	//We need to provide Autowired annotation above constructor if we are using constructor injection
	@Autowired
	public Human(Heart heart) {
		System.out.println("Inside Constructor");
		this.heart = heart;
	}
	
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter Injection");
	}
	
	public void startPumping() {
		if(heart != null) {
			heart.pump();
		}
		
		else {
			System.out.println("Your heart is not pumping anymore..");
		}
	}
}
