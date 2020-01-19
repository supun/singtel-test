package com.singtel.assignment.butterfly;

import com.singtel.assignment.Walkable;
import com.singtel.assignment.util.Constants;

public class CatterpillarState extends Butterfly implements Walkable {
	@Override public void walk() {
		System.out.println(Constants.WALKING);
	}
}
