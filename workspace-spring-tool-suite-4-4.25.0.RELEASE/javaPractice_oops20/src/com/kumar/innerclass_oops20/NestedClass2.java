package com.kumar.innerclass_oops20;

class Outer1 {
	static int x = 10;
	int y = 20;

	static class StaticInner {
		static void show() {
			System.out.println(x);
//			System.out.println(y); // that is not allowed
		}

	}
}

public class NestedClass2 {
	public static void main(String args[]) {
		Outer1.StaticInner.show();
		Outer1.StaticInner inner = new Outer1.StaticInner();
		inner.show();
	}
}