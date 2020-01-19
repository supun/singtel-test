package com.singtel.assignment.fish;

import com.singtel.assignment.Carnivouros;
import com.singtel.assignment.util.Color;
import com.singtel.assignment.util.Constants;
import com.singtel.assignment.util.Size;

public class Shark extends Fish implements Carnivouros {

	public Shark(){
		this.setSize(Size.LARGE);
		this.setColor(Color.GREY);
	}

	@Override public void eatFish() {
		System.out.println(Constants.EATING_OTHER_FISH);
	}
}
