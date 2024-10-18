/*
 * Task 1: Implement a class with a static variable to count 
 * the number of instances and then Create multiple instances
 *  of this class and print the count.
 * 
 */
package com.kumar.Assignments_oops1;

public class InstanceCounter {
	static int counter=0;
	
	public InstanceCounter() {
		counter++;
	}
	
	public int getInstanceCount() {
		return counter;
	}

	public static void main(String[] args) {
		
		InstanceCounter ins1 = new InstanceCounter();
		InstanceCounter ins2 = new InstanceCounter();
		InstanceCounter ins3 = new InstanceCounter();
		InstanceCounter ins4 = new InstanceCounter();
		
		System.out.println("Instances created are (accessing static variable directly):  "+ counter);
		System.out.println("Instances created are (accessing static variable with classname):  "+ InstanceCounter.counter);
		System.out.println("Instances created are (accessing static variable with objreference):  "+ ins1.counter);

	}

}
