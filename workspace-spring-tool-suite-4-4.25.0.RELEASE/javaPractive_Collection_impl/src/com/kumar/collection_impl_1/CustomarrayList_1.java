/**
 * Allow heterogeneous elements 

 */
package com.kumar.collection_impl_1;

import java.util.ArrayList;
import java.util.List;

public class CustomarrayList_1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Hello");
		list.add(1);
		list.add(2.9);
		list.add('A');
		System.out.println(list);
	}

}
