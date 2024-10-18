package com.kumar_Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflection_Impl3 {

	public static void main(String[] args) {
		Person person = new Person();
		Class obj = person.getClass();
		
		Field[] fields = obj.getDeclaredFields();
		for(Field f:fields) {
			System.out.println("Field name: "+f.getName());
			int modifier=f.getModifiers();
			System.out.println("Modifier: "+Modifier.toString(modifier));
			System.out.println("Data Type: "+f.getType());
			System.out.println("-----------------");
		}

	}

}
