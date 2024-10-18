/**
 * Accessing enum value and converting enum value in to string.

 */

package com.kumar.Enum_1;

public class EnumClass1 {

	public static void main(String[] args) {
		System.out.println(Color.WHITE);
		Color color = Color.YELLOW;
		
		System.out.println(color);
		
		String colorConversion = color.toString();
		System.out.println(colorConversion+" this is a String type ");

	}

}
