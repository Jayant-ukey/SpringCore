package com.seleniumexpress.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //@Configuration annotation indicates that the class has @Bean definition methods
public class CollegeConfig {

	//We can give multiple name for one single bean.
	@Bean(name = {"colBean", "AnotherCollegeBean"})
	public College collegeBean() {
		College college = new College();
		return college;
	}
}
