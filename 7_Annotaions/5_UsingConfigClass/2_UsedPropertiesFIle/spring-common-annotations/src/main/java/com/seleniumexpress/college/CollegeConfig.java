package com.seleniumexpress.college;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.seleniumexpress.college")
@PropertySource("college-info.properties")
public class CollegeConfig {
	
}
