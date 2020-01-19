package com.singtel.assignment;

import com.singtel.assignment.util.Color;
import com.singtel.assignment.util.Constants;
import com.singtel.assignment.util.Size;

public class Animal implements IAnimal {
	private boolean male;
    private Size size;
    private Color color;
    private String languageCode;

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	void walk(){
		System.out.println(Constants.WALKING);
	}
}
