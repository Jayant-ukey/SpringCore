package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = context.getBean("stu", Student.class); //This getBean method provide the object of class whose id set as stu in the bean(which is Student class), then we type-cast it to Student class. 
		student.studentCheat();
		
		AnotherStudent anotherStudent = context.getBean("secStu", AnotherStudent.class);
		anotherStudent.anotherStudentCheat();
		
	}
}
