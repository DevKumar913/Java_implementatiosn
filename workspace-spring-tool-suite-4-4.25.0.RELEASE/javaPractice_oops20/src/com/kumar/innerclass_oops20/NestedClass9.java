/**
 * Local Inner class inside instance method.
 */
package com.kumar.innerclass_oops20;

class Outer8 {
	int x = 10;
	static int y = 20;

	public void method() { // instance methods can access static and instance properties.
		class LocalInner {
			void display() {
				System.out.println(x);
				System.out.println(y);
				System.out.println("local inner class");
			}
		}
		LocalInner inner = new LocalInner();
		inner.display();
	}
}

public class NestedClass9 {
	public static void main(String args[]) {
		Outer8 outer = new Outer8();
		outer.method();
	}
}

