package com.kumar.Enum_5;

public class Enum_Parameterized_Constructor {

	public static void main(String[] args) {
		Seasons[] seasons =Seasons.values();
		for(Seasons season : seasons) {
			System.out.println(season +" Avaerage temperature is "+ season.temp);
		}

	}

}
