package com.kumar.Functinal_Interface;

public class LambdaThread {

	public static void main(String[] args) {
		Thread thread1 = new Thread(()->{
			for(int i=0;i<=5;i++) {
				System.out.println("Thread name: "+Thread.currentThread().getName()+"   count :  "+ i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread1.start();
	}
}