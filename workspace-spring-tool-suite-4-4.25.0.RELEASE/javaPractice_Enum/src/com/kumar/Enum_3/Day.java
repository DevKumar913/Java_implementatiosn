/**
 * Enum constructor implicitly called.
 */

package com.kumar.Enum_3;

public enum Day {
	Sun, Mon, Tue, Wed, Thu, Fri, Sat;
	Day(){
		System.out.println("Invoke Constructor.");
	}
}
