/**
 * static nested class can have static and instance both type of class members.
 */

package com.kumar.innerclass_oops20;

class Outer2 {

	static class StaticInner {

		static void show() {
			System.out.println("static method: Inner class");
		}

		void display() {
			System.out.println("Instance method: Inner class");

		}
	}

	public static void main(String[] a) {

	}
}

public class NestedClass3 {
	public static void main(String args[]) {
		Outer2.StaticInner.show();
		Outer2.StaticInner inner = new Outer2.StaticInner();
		inner.display();
	}
}
