package com.kumar.Optional;

import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {
		
		Optional<String> optionalName = Optional.ofNullable(getname());
		String name= optionalName.orElse("unknown");
		System.out.println(name);
	}
	public static String getname() {
		return "Harish";
	}
}