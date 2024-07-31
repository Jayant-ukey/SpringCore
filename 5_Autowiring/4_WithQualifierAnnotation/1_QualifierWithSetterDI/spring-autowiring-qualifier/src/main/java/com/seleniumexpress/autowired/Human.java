package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	private Heart heart;
	
	/*
	 * In the configuration file (beans.xml) we have 2 beans for Heart. Then how we will get to know that which bean we need to execute?
	 * Ans: By using Qualifier annotation we can define that which bean we need to execute.
	 */
	
	/*
	 * @Autowired annotation checks bean first byType and then byName. But we have same type for 2 bean and having different name. 
	 * At that time program may throw an exception. To resolve that we can take the help of @Qualifier annotation.
	 */

	@Autowired
	@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter Injection");
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
		}

		else {
			System.out.println("Your heart is not pumping anymore..");
		}
	}
}
