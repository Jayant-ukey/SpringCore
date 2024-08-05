package com.seleniumexpress.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		//Now we cannot user ClassPathXml Configuration class. Because we don't have any configuration file to pass. So new class comes.
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		College college = context.getBean("colBean", College.class);
		
		//Will get hash-value.
		System.out.println("College object created by spring is : "+college);
		college.test();
	}

}
