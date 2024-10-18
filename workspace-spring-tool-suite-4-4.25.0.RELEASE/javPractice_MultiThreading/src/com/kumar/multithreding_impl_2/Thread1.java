/**
 * Join Method Implementation.

 */
package com.kumar.multithreding_impl_2;

public class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(300);
				System.out.println("The current Thread is: "+ Thread.currentThread() + " "+ i +" times ");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
