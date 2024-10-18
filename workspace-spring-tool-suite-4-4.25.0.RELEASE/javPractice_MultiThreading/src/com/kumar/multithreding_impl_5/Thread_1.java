package com.kumar.multithreding_impl_5;

public class Thread_1 extends Thread{
	
	Table t;
	Thread_1(Table t){
		this.t=t;	
	}
	
	public void run() {
		t.printTable(2);
	}

}
