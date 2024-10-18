package com.kumar.StreamAPI_problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Problem 2: Convert a list of strings to uppercase
//and sort them in reverse order

public class Problem2 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("asebc", "detrf", "gik","ohfdhb");
		
		List<String> result = list.stream()
				.map(String::toUpperCase) //uppercase
				.sorted((a,b) -> b.compareTo(a)) //reverse order
				.collect(Collectors.toList()); 
		
		System.out.println(result);
	}

}
