package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("Seleneium Express")
	private String collegeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	private Teacher teacher;

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("We are from college : "+collegeName);
	}
}
