package com.kumar.multithreding_impl_6;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		ThreadB threadB = new ThreadB();
		threadB.start();
		synchronized(threadB){
			System.out.println("main thread calling wait method.");
			threadB.wait();
			System.out.println("main thread got notification call.");
			System.out.println("Result : "+threadB.total);
		}
	}

}
