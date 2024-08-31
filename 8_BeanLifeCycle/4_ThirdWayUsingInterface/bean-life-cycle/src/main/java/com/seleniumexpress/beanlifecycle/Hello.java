package com.seleniumexpress.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean{
	
	/*
	 * public void init() { System.out.println("Inside hello class init method"); }
	 * 
	 * public void destroy() {
	 * System.out.println("Inside hello class desroy method"); }
	 */

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside after properties set method -> init");
	}

	public void sample() {
		System.out.println("My coding starts and end here inside this method only...");
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside destroy method -> destroy");
	}
}
