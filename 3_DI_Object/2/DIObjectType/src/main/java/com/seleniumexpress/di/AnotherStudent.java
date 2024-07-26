package com.seleniumexpress.di;

public class AnotherStudent {

	private MathCheat cheat;
	
	//Setter name must be correct otherwise it will be the reason of exception
	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void anotherStudentCheat() {
		System.out.println("Another student started cheat..");
		cheat.cheat();
	}
	
}
