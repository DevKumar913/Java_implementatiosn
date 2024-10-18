/**
 * Calling Java run() method directly instead start() method.
 
 */
package com.kumar.multithreding_impl_1;

public class CustomThread_5 {

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" is processing order # " +(i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" finished ordering");
	}
	
	public static void main(String[] args) {
		
		//System.out.println("Main thread: " + Thread.currentThread().getName());
		
		OrderProcessingThread customer1 = new OrderProcessingThread();
		OrderProcessingThread customer2 = new OrderProcessingThread();
		
		customer1.start();
		customer2.start();
		
		System.out.println("Main thread: " + Thread.currentThread().getName());
		
		customer1.run();
		customer2.run();
		

	}
}
