/**
 * Enum can have all attributes that a class can have like - constructor ,
 * static method,instance method,instance data member,static data member etc.
 */

package com.kumar.Enum_6;

public enum Seasons {
	WINTER(5),SPRING(10),SUMMER(15),FALL(20);
	int temp;
	private Seasons(int temp) {
		this.temp=temp;
	}
	
	static String country;
	
	String printDetails() {
		return "Contry : "+country+" Temprature : "+temp;
	}
	
	static{
		country="Russia";
	}
}
