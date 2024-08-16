package com.seleniumexpress.college;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {
	
	public void teach() {
		System.out.println("Hi My name is Dhoni and I am your Science Teacher");
	}
}