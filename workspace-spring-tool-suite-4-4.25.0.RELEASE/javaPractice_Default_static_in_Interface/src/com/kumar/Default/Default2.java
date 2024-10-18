package com.kumar.Default;

import java.util.ArrayList;
import java.util.List;

public class Default2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Harish");
		names.add("Akshitha");
		names.add("Kalyan");
		names.add("Shruthi");
		names.add("Kapil");
		names.add("Afaq");
		names.add("Hiren");
		
		names.forEach(name->System.out.println("Hello " +name));
	}

}
