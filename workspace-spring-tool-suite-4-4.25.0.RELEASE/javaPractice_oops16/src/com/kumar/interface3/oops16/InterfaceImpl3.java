package com.kumar.interface3.oops16;

//Define the Device interface
interface Device {
	void powerOn();
	void powerOff();
}

//Define the Connectivity interface
interface Connectivity {
	void connectToNetwork();
	void disconnectFromNetwork();
}

//Define the Functionality interface for smart devices
interface Functionality {
	void scanItems();
	void displayTotal();
}

//Define the SmartShoppingCart that inherits Device and Connectivity
interface SmartShoppingCart extends Device, Connectivity {
	void showBatteryStatus();
}

//Implementing SmartShoppingCart functionality
class SmartCart implements SmartShoppingCart, Functionality {
	private boolean isOn = false;

	// Implement Device methods
	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("Smart Cart powered on.");
	}

	@Override
	public void powerOff() {
		isOn = false;
		System.out.println("Smart Cart powered off.");
	}

	// Implement Connectivity methods
	@Override
	public void connectToNetwork() {
		System.out.println("Smart Cart connected to the store's network.");
	}

	@Override
	public void disconnectFromNetwork() {
		System.out.println("Smart Cart disconnected from the network.");
	}

	// Implement SmartShoppingCart methods
	@Override
	public void showBatteryStatus() {
		System.out.println("Battery status: 75% remaining.");
	}

	// Implement Functionality methods
	@Override
	public void scanItems() {
		System.out.println("Scanning items in the cart...");
	}

	@Override
	public void displayTotal() {
		System.out.println("Total amount to pay: $150.");
	}
}

//Main class to demonstrate the functionality of SmartCart
public class InterfaceImpl3 {
	public static void main(String[] args) {
		SmartCart smartCart = new SmartCart();
		
		// Device functionality
		smartCart.powerOn();
		smartCart.showBatteryStatus();
		
		// Connectivity functionality
		smartCart.connectToNetwork();
		
		// Functionality of the cart
		smartCart.scanItems();
		smartCart.displayTotal();
		
		// Disconnect and power off
		smartCart.disconnectFromNetwork();
		smartCart.powerOff();
	}
}

