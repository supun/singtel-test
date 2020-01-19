package com.singtel.assignment.fish;

import com.singtel.assignment.Animal;
import com.singtel.assignment.Swimmable;
import com.singtel.assignment.util.Constants;

public class Dolphin extends Animal implements Swimmable {

	@Override public void swim() {
		System.out.println(Constants.SWIMMING);
	}
}
