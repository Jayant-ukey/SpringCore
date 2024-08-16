package com.seleniumexpress.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //If you have more than one class which implements the same interface then we can use primary for default calling
public class MathTeacher implements Teacher{

	public void teach() {
		System.out.println("Hi My name is Sourav and I am your Math Teacher");
	}
}
