package com.seleniumexpress.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("collegeBean", College.class);
		
		college.test();
		
		// If we didn't close the context then we can get the warning.
		// Here we are doing the type casting first because ApplicationContext is the interface and it doesn't have close method.
		((AnnotationConfigApplicationContext)context).close();
	}
}
