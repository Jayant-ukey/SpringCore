package com.seleniumexpress.di;

public class Student {

	/*
	 * Consider If we want to cheat for every subject then here we need to delete mathCheat, then need to create ref variable of respective class,
	 * Then need to create setter for that particular variable, then do updation in cheating method. Lots of modification is needed.
	 * Which is bad-coding. 
	 */
	 
	private MathCheat mathCheat;
//	private ScienceCheat scienceCheat;
	
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	/*
	 * public void setScienceCheat(ScienceCheat scienceCheat) { this.scienceCheat =
	 * scienceCheat; }
	 */
	
	public void cheating() {
		mathCheat.mathCheat();
	}
}
