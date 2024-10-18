package com.kumar.multithreding_impl_5;

public class Main {

	public static void main(String[] args) {
		Table table_obj = new Table();
		
		Thread_1 table_2 = new Thread_1(table_obj);
		Thread_2 table_3 = new Thread_2(table_obj);
		
		table_2.start();
		table_3.start();

	}

}
