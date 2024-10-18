package com.kumar.Functinal_Interface;

@FunctionalInterface
interface Show{
	public void show();
}
public class NeedOfLambda2 {

	public static void main(String[] args) {
		Show obj = ()->System.out.println("this is the information to be shown");
		obj.show();

	}

}
