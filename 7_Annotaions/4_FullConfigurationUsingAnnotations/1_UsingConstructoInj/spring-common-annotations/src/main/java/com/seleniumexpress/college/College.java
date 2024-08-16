package com.seleniumexpress.college;


public class College {
	
	private Principal principal;
		
	public College(Principal principal) {
		this.principal = principal;
	}

	public void test() {
		principal.principalInfo();
		System.out.println("This method is  for testing purpose..");
	}
}
