package com.seleniumexpress.autowired;

public class Heart {

	private String nameOfAnimnal;

	private int noOfHeart;

	public void setNameOfAnimnal(String nameOfAnimnal) {
		this.nameOfAnimnal = nameOfAnimnal;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	public void pump() {
		System.out.println("Heart is pumping.. You are alive!.." + ". You are " + nameOfAnimnal + " and having "
				+ noOfHeart + " hearts");
	}
}
