package com.seleniumexpress.college;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

	public void teach() {
		System.out.println("Hi My name is Sourav and I am your Math Teacher");
	}
}
