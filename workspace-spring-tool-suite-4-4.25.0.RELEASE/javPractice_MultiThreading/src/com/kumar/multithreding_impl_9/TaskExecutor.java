package com.kumar.multithreding_impl_9;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class TaskExecutor {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<String> future = executor.submit(new Task());
		Thread.sleep(2000);
		if (future.isDone()) {
			try {
				System.out.println("ruturen value from call method is : " + future.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		executor.shutdown();
	}
}

