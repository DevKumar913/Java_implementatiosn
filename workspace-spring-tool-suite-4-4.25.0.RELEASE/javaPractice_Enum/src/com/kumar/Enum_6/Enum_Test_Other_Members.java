package com.kumar.Enum_6;

public class Enum_Test_Other_Members {

	public static void main(String[] args) {
		Seasons[] seasons=Seasons.values();
		for(Seasons season:seasons) {
			System.out.println(season+" "+season.printDetails() );
			
		}

	}

}
