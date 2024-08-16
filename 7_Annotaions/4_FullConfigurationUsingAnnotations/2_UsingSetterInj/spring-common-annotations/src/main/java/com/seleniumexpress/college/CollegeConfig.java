package com.seleniumexpress.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean
	public College collegeBean() {
		College college =  new College();
		System.out.println("Using setter Injection");
		college.setPrincipal(principalBean());
		return college;
	}

}
