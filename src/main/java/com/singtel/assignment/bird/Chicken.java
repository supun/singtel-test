package com.singtel.assignment.bird;

import com.singtel.assignment.*;
import com.singtel.assignment.util.Constants;

public class Chicken extends Bird implements  Walkable, Singable {

	public Chicken(){

	}

	public Chicken(boolean isMale){
		this.setMale(isMale);
	}


	@Override
	public void walk(){
		System.out.println(Constants.WALKING);
	}

	@Override public void sing() {
        if(this.isMale()){
        	System.out.println(Constants.ROOSTER_SOUND);
		} else {
			System.out.println(Constants.CHICKEN_SOUND);

		}
	}
}
