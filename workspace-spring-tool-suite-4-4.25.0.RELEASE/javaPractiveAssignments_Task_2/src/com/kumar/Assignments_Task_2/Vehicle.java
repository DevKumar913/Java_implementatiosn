/*Create a superclass Vehicle with a protected attribute speed. 
 * Create a subclass Car that inherits from Vehicle and has a method displaySpeed() 
 * to access and display the speed attribute.
        usecase 1 - create car class within same package. 
        usecase 2 - create car class within other package
 * 
 * 
 */

package com.kumar.Assignments_Task_2;

public class Vehicle{
	protected double speed;
	
	public static void main(String[] args) {
		Car car = new Car();
		car.displaySpeed();

	}
}
class Car extends Vehicle{
	public void displaySpeed() {
		
		speed = 45.5;
		System.out.println(speed);
		
	}
}

