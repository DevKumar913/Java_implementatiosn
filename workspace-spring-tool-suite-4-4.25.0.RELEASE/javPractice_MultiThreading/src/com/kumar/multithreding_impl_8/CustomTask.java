package com.kumar.multithreding_impl_8;

public class CustomTask implements Runnable {
    private String name;
 
    public CustomTask(String name) {
        this.name = name;
    }
 
    public void run() { 
        System.out.println("Thread : "+name+"starts");
        for(int i = 1;i<=5;i++) {
        	System.out.println(i);
        }
        System.out.println("Real name of the thread :"+Thread.currentThread().getName());
        System.out.println("Thread : "+name+" ends");
    } 
}
