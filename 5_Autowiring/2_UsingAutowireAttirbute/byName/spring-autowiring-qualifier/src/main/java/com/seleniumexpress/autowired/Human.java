package com.seleniumexpress.autowired;

public class Human {

	private Heart heart;
	
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
