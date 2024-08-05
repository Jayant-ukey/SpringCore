package com.seleniumexpress.college;

import org.springframework.stereotype.Component;


//@Component is an annotation that allows Spring to detect our custom beans automatically
@Component("collegeBean")
public class College {

	public void test() {
		System.out.println("Test method called");
	}
}
