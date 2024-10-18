package com.kumar.Functinal_Interface;

@FunctionalInterface
interface ToDisplay {
	public void  display();
}

class Display implements ToDisplay{
	public void display() {
		System.out.println("this is the information to be displayed");
	}
}
public class NeedOfLambda1 {

	public static void main(String[] args) {
		Display obj = new Display();
		obj.display();
		
		
	}

}
