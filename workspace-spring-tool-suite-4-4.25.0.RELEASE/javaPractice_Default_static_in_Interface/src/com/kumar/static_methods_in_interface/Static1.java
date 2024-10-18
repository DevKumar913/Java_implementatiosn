package com.kumar.static_methods_in_interface;


interface MathOperation{
	int operate(int a, int b);
	
	static int add(int a, int b) {
		return a+b;
	}
	static int substract(int a, int b) {
		return a-b;
	}
}
public class Static1 {

	public static void main(String[] args) {
		int addition = MathOperation.add(2, 3);
		int substraction = MathOperation.substract(5, 2);
		
		System.out.println(" Addition "+addition+" Substraction "+substraction);

	}

}
