package com.kumar.Default;

interface Draw{
	public void draw();
	
	default void drawDefault() {
		System.out.println("this is Draw Default method from interface");
	}
}

class Circle implements Draw{
	public void draw() {
		System.out.println("this is Draw circle method in Circle class-overridden");
	}
}


public class Default1 {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();
		circle.drawDefault();

	}

}
