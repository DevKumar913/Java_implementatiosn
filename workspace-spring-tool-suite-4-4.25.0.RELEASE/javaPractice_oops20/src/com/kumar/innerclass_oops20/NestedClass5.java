/**
 * Instance nested class can define only intance class memebers.
 */
package com.kumar.innerclass_oops20;



class Outer4 {
	class Inner {
		void show() {
			System.out.println("Instance method: Inner class");
		}
		/*
		static void display() { //static method is not allowed. 
			System.out.println("static method: Inner class");
		}
		*/
	}
}

public class NestedClass5 {
	public static void main(String args[]) {
		Outer4 outer = new Outer4();
		Outer4.Inner inner = outer.new Inner();
		inner.show();
	}
}
