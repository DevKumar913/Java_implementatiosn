package com.kumar_Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflection_Impl2 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Person person = new  Person();
		Class obj = person.getClass();
		
		Field  field1 = obj.getField("name");
		
		field1.set(person,"Chary");
		String value = (String) field1.get(person);
		System.out.println("Value :" +value);
		
		int mod = field1.getModifiers();
		String modifier1 = Modifier.toString(mod);
		
		System.out.println("Modifier : "+ modifier1);
		System.out.println(person.toString());
		

	}

}
