package com.kumar.StreamAPI_problems;

import java.util.Arrays;

//Problem 1: Find the sum of all odd numbers in an array

public class Problem1 {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		int sum = Arrays.stream(array).filter(n->n%2 !=0).sum();
		System.out.println(sum);
	}
}