package com.kumar.multithreding_impl_7;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new Executor1("Task1"));
        executor.submit(new Executor2("Task2"));
        executor.shutdown();
    }
}
