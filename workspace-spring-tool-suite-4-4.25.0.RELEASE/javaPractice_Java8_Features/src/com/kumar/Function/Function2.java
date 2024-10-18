package com.kumar.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>(Arrays.asList("harish","Kalyan","Akshitha","Shruthi","Kapil","Afaq","hiren"));
		List<String> captalizeNames = new ArrayList<>();
		Function<String,String> capitalizeFun =name->name.toUpperCase();
		for(String name: names) {
			captalizeNames.add(capitalizeFun.apply(name));
		}

		System.out.println(names);
		System.out.println();
		System.out.println(captalizeNames);
	}

}
