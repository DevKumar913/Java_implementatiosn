package com.kumar.Functinal_Interface;

import java.util.function.Supplier;

public class Supplier_F_I {

	public static void main(String[] args) {
		Supplier<String> supply = ()->"this is supplier which takes nothing but gives this using get methiod";
		System.out.println(supply.get());
	}

}
