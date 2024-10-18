/**
 * Local Inner class inside static method can only access 
 * static member of outer class.
 */
package com.kumar.innerclass_oops20;


class Outer7 {
	int x = 10;
	static int y = 20;

	public static void method() { // static methods can only access static properties.
		class LocalInner {
			void display() {
				System.out.println(y);
				System.out.println("local inner class");
			}
		}
		LocalInner inner = new LocalInner();
		inner.display();
	}
}

public class NestedClass8 {
	public static void main(String args[]) {
		Outer7 outer = new Outer7();
		outer.method();
	}
}

