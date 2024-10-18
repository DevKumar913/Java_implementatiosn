package com.kumar.multithreding_impl_5;

public class Table {
	
	void printTable(int n) {
		
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				
				System.out.println(n+"  *  "+i+"  =  "+(n*i));
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
