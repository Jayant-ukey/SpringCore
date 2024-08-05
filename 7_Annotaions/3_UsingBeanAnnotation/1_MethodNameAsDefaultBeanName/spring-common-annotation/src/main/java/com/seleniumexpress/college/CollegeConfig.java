package com.seleniumexpress.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //@Configuration annotation indicates that the class has @Bean definition methods
public class CollegeConfig {

	//Here we are not giving any name to the bean. It consider method name as bean name.
	@Bean
	public College collegeBean() {
		College college = new College();
		return college;
	}
}
