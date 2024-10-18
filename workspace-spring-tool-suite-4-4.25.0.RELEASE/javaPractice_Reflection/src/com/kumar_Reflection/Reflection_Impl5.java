package com.kumar_Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection_Impl5 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Person person = new Person();
		Class obj = person.getClass();
		
		Method method = obj.getDeclaredMethod("privateInformation");
		method.setAccessible(true);
		method.invoke(person);
				

	}

}
