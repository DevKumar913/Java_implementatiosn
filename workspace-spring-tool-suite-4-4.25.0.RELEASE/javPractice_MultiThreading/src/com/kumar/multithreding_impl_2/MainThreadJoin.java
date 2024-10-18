/**
 * Join Method Implementation.

 */


package com.kumar.multithreding_impl_2;

public class MainThreadJoin {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread1 thread2 = new Thread1();
		Thread1 thread3 = new Thread1();
		
		thread1.start();
		
		thread1.yield();
		
		
		thread2.start();
		thread3.start();
		

	}

}
