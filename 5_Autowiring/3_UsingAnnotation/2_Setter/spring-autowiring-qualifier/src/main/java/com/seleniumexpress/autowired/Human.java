package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;
	
	//If you are performing setter injection then annotation need to be present above setter method.
	
	@Autowired
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
