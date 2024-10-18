/**
 * Instance nested class can access static and instance both
 *  type of class memebers of outer class.

 */
package com.kumar.innerclass_oops20;




class Outer3 {
	static int x = 10;
	int y = 20;

	class Inner {
		void show() {
			System.out.println(x);
			System.out.println(y);
		}
	}
}

public class NestedClass4 {
	public static void main(String args[]) {
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		inner.show();
	}
}
