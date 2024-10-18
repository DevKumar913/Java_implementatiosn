/*
 * This method implements Association 
 * 
 */
package com.kumar.oops8;

class VehicleType{
	String vehicleType;
	
	public void setVehicletype(String vehicleType) {
		this.vehicleType=vehicleType;
		System.out.println("Vehicle Type: "+ vehicleType);
	}
}
public class VehicleRental {
	
	int hourlyPrice;
	String customerName;
	int noOfHours;
	double totalCost;
	
	
	public void setDetails(String customerName,int hourlyPrice, int noOfHours) {
		this.customerName=customerName;
		this.hourlyPrice=hourlyPrice;
		this.noOfHours=noOfHours;
	}
	
	public void displayRentDetails() {
		
		System.out.println("customerName: "+ customerName);
		System.out.println("hourlyPrice : " +hourlyPrice);
		System.out.println("noOfHours : "+ noOfHours);
		System.out.println("totalCost : "+ (hourlyPrice*noOfHours));
		
	}

	public static void main(String[] args) {
		
		VehicleRental car = new VehicleRental();
		VehicleType vehicletype = new VehicleType();
		vehicletype.setVehicletype("CAR");
		car.setDetails("Robert",50,5);
		car.displayRentDetails();
		
		

	}

}
