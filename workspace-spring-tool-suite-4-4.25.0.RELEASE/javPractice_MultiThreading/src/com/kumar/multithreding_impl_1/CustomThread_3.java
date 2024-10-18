/**
 * Thread creation using anonymous class
 */
package com.kumar.multithreding_impl_1;

public class CustomThread_3 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
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
		},"My thread");
		thread.start();
	}

}
