package com.kumar.method_Reference;

import java.util.Arrays;
import java.util.List;
@FunctionalInterface
interface MySquareFunction {
	int square(int n);
}

public class staticMethodReference2 {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
		numbers.stream().map(Integer::parseInt).forEach(System.out::println);
	}

}
