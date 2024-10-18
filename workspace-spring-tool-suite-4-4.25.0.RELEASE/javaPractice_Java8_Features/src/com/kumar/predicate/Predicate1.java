package com.kumar.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>(Arrays.asList("Harish","Akshitha","Kalyan","Kapil","Hiren"));
		Predicate<String> startsWithC= name->name.startsWith("H");
		
		names.stream().filter(startsWithC).forEach(System.out::println);
	}

}
