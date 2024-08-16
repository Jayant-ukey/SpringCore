package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	private Principal principal;
	
	private Teacher teacher;
		
	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	
	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("This method is  for testing purpose..");
	}
}
