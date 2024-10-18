/*
 * Build a system with classes Vehicle, Car, Truck, and RentalAgency. 
 * Implement inheritance and method overriding to handle rental operations 
 * for different vehicle types.
 */
package com.kumar.Assignments_Task_2;

import java.util.ArrayList;
import java.util.List;

// Vehicle class (base class)
class Vehicle1 {
    protected String licenseNumber;
    protected double rentalRate;
    
    public Vehicle1(String licenseNumber, double rentalRate) {
        this.licenseNumber = licenseNumber;
        this.rentalRate = rentalRate;
    }
    
    // Method to be overridden by subclasses
    public void rent() {
        System.out.println("Renting a vehicle with License: " + licenseNumber);
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public double getRentalRate() {
        return rentalRate;
    }
}

// Car class (inherits from Vehicle)
class Car1 extends Vehicle1 {
    
    public Car1(String licenseNumber, double rentalRate) {
        super(licenseNumber, rentalRate);
    }
    
    // Overriding rent method for Car
    @Override
    public void rent() {
        System.out.println("Renting a car with License: " + licenseNumber + " at $" + rentalRate + " per day.");
    }
}

// Truck class (inherits from Vehicle)
class Truck extends Vehicle1 {
    
    public Truck(String licenseNumber, double rentalRate) {
        super(licenseNumber, rentalRate);
    }
    
    // Overriding rent method for Truck
    @Override
    public void rent() {
        System.out.println("Renting a truck with License: " + licenseNumber + " at $" + rentalRate + " per day.");
    }
}

// RentalAgency class to manage rentals
class RentalAgency {
    private List<Vehicle1> availableVehicles;

    public RentalAgency() {
        availableVehicles = new ArrayList<>();
    }

    // Add vehicle to the agency
    public void addVehicle(Vehicle1 vehicle) {
        availableVehicles.add(vehicle);
    }

    // Rent out a vehicle by license number
    public void rentVehicle(String licenseNumber) {
        for (Vehicle1 vehicle : availableVehicles) {
            if (vehicle.getLicenseNumber().equals(licenseNumber)) {
                vehicle.rent();
                return;
            }
        }
        System.out.println("Vehicle with License " + licenseNumber + " not found.");
    }

    // Display all available vehicles
    public void displayAvailableVehicles() {
        for (Vehicle1 vehicle : availableVehicles) {
            System.out.println("License: " + vehicle.getLicenseNumber() + ", Rental Rate: $" + vehicle.getRentalRate());
        }
    }
}

// Main class to demonstrate the system
public class RentalSystemDemo {

    public static void main(String[] args) {
        // Create vehicles
        Car1 car1 = new Car1("ABC123", 50.0);
        Truck truck1 = new Truck("XYZ789", 80.0);

        // Create rental agency and add vehicles
        RentalAgency agency = new RentalAgency();
        agency.addVehicle(car1);
        agency.addVehicle(truck1);

        // Display available vehicles
        System.out.println("Available Vehicles:");
        agency.displayAvailableVehicles();
        
        // Rent a car
        System.out.println("\nRenting a Car:");
        agency.rentVehicle("ABC123");
        
        // Rent a truck
        System.out.println("\nRenting a Truck:");
        agency.rentVehicle("XYZ789");
    }
}

