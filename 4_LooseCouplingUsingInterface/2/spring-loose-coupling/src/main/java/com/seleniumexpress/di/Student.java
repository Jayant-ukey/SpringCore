package com.seleniumexpress.di;

public class Student {

	//Achieving loose coupling using interface. Here We don't need to make variable of class, instead of that we are using interface.
	private Cheat cheat;
	
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public void cheating() {
		cheat.cheat();
	}
}
