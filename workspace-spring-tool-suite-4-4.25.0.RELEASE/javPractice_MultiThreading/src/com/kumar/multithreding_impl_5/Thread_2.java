package com.kumar.multithreding_impl_5;

public class Thread_2 extends Thread{
	Table t;
	Thread_2(Table t){
		this.t=t;	
	}
	
	public void run() {
		t.printTable(3);
	}

}
