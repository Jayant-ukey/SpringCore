package com.seleniumexpress.beanlifecycle;

public class Hello {
	
	public void init()
	{
		System.out.println("Inside hello class init method");
	}
	
	public void destroy() {
		System.out.println("Inside hello class desroy method");
	}
}
