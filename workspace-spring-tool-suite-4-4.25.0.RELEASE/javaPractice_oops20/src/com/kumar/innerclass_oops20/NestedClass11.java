/**
 * Anonymous inner class  
 */

package com.kumar.innerclass_oops20;

interface Base {
	void method();
}

public class NestedClass11 {
	public static void main(String[] s) {
		Base base = new Base() {
			public void method() {
				System.out.println("Implementation Class: method()");
			}
		};
		base.method();
	}
}
