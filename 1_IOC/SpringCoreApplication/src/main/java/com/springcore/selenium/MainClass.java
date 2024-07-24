package com.springcore.selenium;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Sim sim = context.getBean("simName", Sim.class);
		sim.call();
		sim.data();
	}
}
