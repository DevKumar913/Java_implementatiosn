package com.kumar.Assignment_task2B;

import com.kumar.Assignments_Task_2.Vehicle;

class Car extends Vehicle{
		public void displaySpeed() {
			speed = 45.6;
			System.out.println(speed);
		}
}

public class Task_4_B {
	public static void main(String[] args) {
		Car car = new Car();
		car.displaySpeed();
	}

}
