package com.kumar.collection_impl_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomArrayList_4 {


		public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("Hello");
			list.add("Hi");
			list.add("bye");
			list.add("How are you");
			list.add("See you.");

			// list itration
			// 1
			
//			for (String value : list) {
//				if (!(value.equals("Hi") || value.equals("See you.")))
//					System.out.println(value);
//			}
			
			
			
//			Iterator<String> itr = list.iterator();
//			while(itr.hasNext()) {
//				String value = (String) itr.next();
//				if(value.equals("Hello"))
//					itr.remove();
//			}
//			System.out.println(list);
			ListIterator<String> ListItr= list.listIterator();
			System.out.println(ListItr.previous());
			
//			while(ListItr.hasNext()) {
//				
//			
//				System.out.println(ListItr.next());
//			}
//			while(ListItr.hasPrevious()) {
//				System.out.println(ListItr.previous());
//			}
		}
	}
