package com.seleniumexpress.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //@Configuration annotation indicates that the class has @Bean definition methods
public class CollegeConfig {

	//Used name to change default name of bean
	@Bean(name = "colBean")
	public College collegeBean() {
		College college = new College();
		return college;
	}
}
