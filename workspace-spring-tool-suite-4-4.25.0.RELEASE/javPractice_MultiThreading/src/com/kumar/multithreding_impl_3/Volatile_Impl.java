//   Volatile_Impl 

package com.kumar.multithreding_impl_3;

public class Volatile_Impl {
	private static  volatile int counter =0;

	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			int localCounter=counter;
			while(localCounter<10) {
				if(localCounter!=counter) {
					System.out.println("Thread1 reads the shared variable changes ");
					localCounter=counter;
				}
			}
		});
		t1.start();
		Thread t2 = new Thread(()->{
			int localCounter=counter;
			while(localCounter<10) {
				System.out.println("Thread2 updates the shared variable to "+ (localCounter+1));
				counter=++localCounter;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t2.start();
	}
}