package com.kumar.method_Reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InstanceMethod2 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>(Arrays.asList("apple", "mango", "cherrry", "pears"));
		String target = "mango";
		
		fruits.stream()
			.filter(target::equals)
			.forEach(fruit -> System.out.println("Found: " + fruit));
	}

}
