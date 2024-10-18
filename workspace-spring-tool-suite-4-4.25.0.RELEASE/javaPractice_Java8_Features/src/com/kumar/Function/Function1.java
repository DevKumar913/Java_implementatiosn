package com.kumar.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		Function<Integer,Integer> squareFun = num -> num*num;
		
		List<Integer> squares = new ArrayList<>();
		
		for(Integer n:numbers) {
			squares.add(squareFun.apply(n));
		}
		
		System.out.println(numbers);
		System.out.println(squares);
	}

}
