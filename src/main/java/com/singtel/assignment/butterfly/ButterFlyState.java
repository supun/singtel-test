package com.singtel.assignment.butterfly;

import com.singtel.assignment.Flyable;
import com.singtel.assignment.util.Constants;

public class ButterFlyState extends Butterfly implements Flyable {
	@Override public void fly() {
		System.out.println(Constants.FLYING);
	}
}
