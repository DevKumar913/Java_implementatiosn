package com.kumar.Optional;

import java.util.Optional;

public class Optional2 {

	public static void main(String[] args) {
		Optional<String> optionalName = Optional.ofNullable(getname());
		String name= optionalName.map(String::toUpperCase).orElse("No Name Provided");
		System.out.println(name);
	}
	public static String getname() {
		return "Harish";
		//return null;
	}
}
