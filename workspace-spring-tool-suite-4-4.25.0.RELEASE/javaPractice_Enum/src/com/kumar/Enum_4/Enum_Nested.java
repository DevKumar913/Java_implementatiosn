/**
 * Nested Enum

 */
package com.kumar.Enum_4;

public class Enum_Nested {
	enum Seasons{
		WINTER,SPRING,SUMMER,FALL;
	}

	public static void main(String[] args) {
		for(Seasons season: Seasons.values()) {
			System.out.println(season+"'s Ordinal Value is "+season.ordinal());
		}
		

	}

}
