/**
 * Example of using generics
 */
package com.kumar.collection_impl_1;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList_2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Hello");
		list.add("Hai");
		list.add("How Are You");
		list.add("A");
		System.out.println(list);
	}

}