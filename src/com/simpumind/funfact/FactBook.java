package com.simpumind.funfact;

import java.util.Random;

public class FactBook {
	//Member variable(Proerties about the object).
	public String[] mFacts = {
			"Ants stretch when they wake up in the morning",
			"Olympic gold medal are actually made moostly of silvers",
			"Ostrich can run faster than horses",
			"you are born with 300 bones, by the time you are an adult you have 206.",
			"It takes about 8 mins for light of the Sun to reach the Earth.",
			"Some bamboo plants can grow almost a meter in just one day.",
			"The state of Florida is bigger than England.",
			"Some peguins can leap 2 t0 3 meters out of the water.",
			"On average it takes 66 days to form a new habbit.",
			"Mamonths still walked in the earth when the Great Pyramid was being built."
			
	};
	//Method (abilities the object can do).
	
	public String getFact(){
		String fact = "";
		//randomly select a fact
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mFacts.length);
		fact = mFacts[randomNumber];
		
		return fact;
	}
}
