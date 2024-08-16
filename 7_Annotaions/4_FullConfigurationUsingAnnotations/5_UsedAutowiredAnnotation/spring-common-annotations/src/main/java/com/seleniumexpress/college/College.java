package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Autowired
	private Principal principal;
	
	@Autowired
	private Teacher teacher;

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("This method is  for testing purpose..");
	}
}
