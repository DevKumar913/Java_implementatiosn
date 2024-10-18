/**
 * Thread creation using Runnable interface
 */

package com.kumar.multithreding_impl_1;

public class MultiThreading_2 implements Runnable{	
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
			
			Thread customer1 = new Thread(new MultiThreading_2());
			Thread customer2 = new Thread(new MultiThreading_2());
			
			customer1.start();
			customer2.start();

			
			
			System.out.println("Main thread: " + Thread.currentThread().getName());

		}

	}

