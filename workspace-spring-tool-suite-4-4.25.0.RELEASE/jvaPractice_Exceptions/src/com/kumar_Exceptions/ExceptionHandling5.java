package com.kumar_Exceptions;
/**
 * Nested try catch block implementation.
 */


public class ExceptionHandling5 {

	public static void main(String[] args) {
		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println("Accessing element at index 5: " + numbers[2]);
			try {
				String str = null;
				System.out.println("Length of the string: " + str.length());
			} catch (NullPointerException innerException) {
				System.out.println("Inner Catch Block: Null pointer exception occurred.");
			}
		} catch (ArrayIndexOutOfBoundsException outerException) {
			System.out.println("Outer Catch Block: Array index out of bounds exception occurred.");
		}
		System.out.println("Program continues after exceptions.");
	}
}
