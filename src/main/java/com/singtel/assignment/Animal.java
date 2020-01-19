package com.singtel.assignment;

import com.singtel.assignment.util.Constants;

public class Animal implements IAnimal {
	private boolean male;

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}
	void walk(){
		System.out.println(Constants.WALKING);
	}
}
