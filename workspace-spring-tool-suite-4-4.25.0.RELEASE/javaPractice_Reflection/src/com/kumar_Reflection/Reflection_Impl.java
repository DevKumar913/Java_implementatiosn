package com.kumar_Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection_Impl {

	public static void main(String[] args) {
		Person person = new Person();
		Class obj = person.getClass();
		Method[] methods = obj.getMethods();
		for(Method m: methods) {
			System.out.println("Method Name: "+m.getName());
			int modifier=m.getModifiers();
			System.out.println("Modifier: " + Modifier.toString(modifier));
			System.out.println("Return Types: " + m.getReturnType());
			System.out.println("=======================================");
		}
	}
}
