package com.seleniumexpress.di;

public class AnotherStudent {

	private MathCheat mathCheat;
	
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public void anotherStudentCheat() {
		System.out.println("Another student started cheat..");
		mathCheat.cheat();
	}
	
}
