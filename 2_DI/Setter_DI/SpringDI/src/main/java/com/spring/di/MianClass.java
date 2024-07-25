package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MianClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student obj = context.getBean("student", Student.class); //passing first id, then telling it is class of this particular dependency.
		obj.displayStudentInformation();
		
		
		
		Student obj2 = context.getBean("secondStudent", Student.class);
		obj2.displayStudentInformation();
	}

}
