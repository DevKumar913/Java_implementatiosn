/**
 * Local Inner class
 */
package com.kumar.innerclass_oops20;

class Outer6 {
	public void method() {
		class LocalInner {
			void display() {
				System.out.println("local inner class");
			}
		}
		LocalInner inner = new LocalInner();
		inner.display();
	}
}

public class NestedClass7 {
	public static void main(String args[]) {
		Outer6 outer = new Outer6();
		outer.method();
	}
}
