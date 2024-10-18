package com.kumar_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Reflection_Impl4 {

	public static void main(String[] args) {
		Person person = new Person();
		Class obj = person.getClass();
		
		Constructor[] constructors = obj.getDeclaredConstructors();
		for(Constructor constrcuctor :constructors ) {
			System.out.println("Constructor Name: "+constrcuctor.getName());
			int modifier = constrcuctor.getModifiers();
			System.out.println("Modifier: "+Modifier.toString(modifier));
			System.out.println("Parameters passed count :"+constrcuctor.getParameterCount());
			System.out.println("-------------------------");
		}

	}

}
