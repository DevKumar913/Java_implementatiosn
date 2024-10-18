package com.kumar.Functinal_Interface;

import java.util.function.Consumer;

public class Consumer_F_I {

	public static void main(String[] args) {
		Consumer<String> namePrinter = (name)->{
			System.out.println("Hello "+ name);
			};
			
			namePrinter.accept("Harish");

	}

}
