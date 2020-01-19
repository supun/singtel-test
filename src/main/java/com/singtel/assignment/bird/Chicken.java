package com.singtel.assignment.bird;

import com.singtel.assignment.*;
import com.singtel.assignment.util.Constants;

import java.util.HashMap;
import java.util.Map;

public class Chicken extends Bird implements  Walkable, Singable {
	private Map<String, String> sounds= new HashMap<>();

	public Chicken(){

	}

	public Chicken(boolean isMale){
		this.setMale(isMale);
		if(this.isMale()){
			this.setLanguageCode("Danish");
			sounds.clear();
			generateRoosterSounds();
		}
	}


	@Override
	public void walk(){
		System.out.println(Constants.WALKING);
	}

	@Override public void sing() {
        if(this.isMale()){
        	System.out.println( this.sounds.get(this.getLanguageCode()));
		} else {
			System.out.println(Constants.CHICKEN_SOUND);

		}
	}

	void generateRoosterSounds(){
		sounds.put("Danish","kykyliky");
		sounds.put("Dutch","kukeleku");
		sounds.put("Finnish","kukko kiekuu");
		sounds.put("French","cocorico");
		sounds.put("German","kikiriki");
		sounds.put("Greek","kikeriki");
		sounds.put("Hebrew","coo-koo-ri-koo");
		sounds.put("Hungarian","kukuriku");

	}
}
