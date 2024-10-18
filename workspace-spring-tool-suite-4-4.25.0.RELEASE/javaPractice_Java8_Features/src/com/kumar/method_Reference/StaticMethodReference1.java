package com.kumar.method_Reference;

@FunctionalInterface
interface MySquareFunctionInterface{
	int square(int n);
}
public class StaticMethodReference1 {

	public static void main(String[] args) {
		MySquareFunctionInterface squareFun = StaticMethodReference1::calculateSquare;
		
		System.out.println(squareFun.square(8));

	}
	
	public static int calculateSquare(int n) {
		return n*n;
	}

}
