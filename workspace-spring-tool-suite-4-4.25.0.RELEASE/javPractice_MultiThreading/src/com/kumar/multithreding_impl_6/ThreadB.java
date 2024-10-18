package com.kumar.multithreding_impl_6;

public class ThreadB extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculation.");
			for (int i = 1; i <= 50; i++) {
				total = total + 1;
			}
			System.out.println("child thread giving notification call.");
			this.notify();
		}
	}
}
