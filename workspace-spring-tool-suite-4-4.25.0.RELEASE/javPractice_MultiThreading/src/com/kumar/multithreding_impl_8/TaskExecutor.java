package com.kumar.multithreding_impl_8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(() -> {
			System.out.println("Start executing " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				System.out.println("Executing " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Finished execution " + Thread.currentThread().getName());
			System.out.println();
		});
		executor.submit(new CustomTask("Custom Task"));
		executor.shutdown();
	}
}
