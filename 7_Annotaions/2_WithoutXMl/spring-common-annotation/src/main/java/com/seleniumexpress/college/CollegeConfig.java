package com.seleniumexpress.college;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //@Configuration annotation indicates that the class has @Bean definition methods
@ComponentScan(basePackages = "com.seleniumexpress.college") //This annotation is used to specify the packages that we want to be scanned.
public class CollegeConfig {

}
