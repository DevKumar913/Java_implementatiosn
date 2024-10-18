package com.kumar.StreamAPI;


import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApi_IMPL1 {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * We can use any collection and use stream method on it.
		 * 
		 * 
		 */

			System.out.println(Arrays.asList(2, 3, 1, 4, 5, 3).stream());
			
			 
			
			int[] array = { 1, 2, 3, 4, 5, 6 };
			Arrays.stream(array);

			String string = "Kumar";
			Stream<Character> stream = string.chars().mapToObj(s -> (char) s);
			
			Stream.of(1, 2, 3, 4, 5, 6, 7).forEach(System.out::print);
}
	
}