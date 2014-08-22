package com.simpumind.funfact;

import java.util.Random;

import android.graphics.Color;

public class ColorWheel {
	//Member variable(Proerties about the object).
		public String[] mColor = {
				"#39add1",
				"#3079ab",
				"#c25975",
				"#e15256",
				"#f9845b",
				"#838cc7",
				"#7d669e",
				"#53bbb4",
				"#51b46d",
				"#e0ab18",
				"#637a91",
				"#f092b0",
				"#b7c0c7"
				
		};
		//Method (abilities the object can do).
		
		public int setColor(){
			String color = "";
			//randomly select a fact
			Random randomGenerator = new Random();
			int randomNumber = randomGenerator.nextInt(mColor.length);
			color = mColor[randomNumber];
			int colorAsInt = Color.parseColor(color);
			
			return colorAsInt;
		}
}
