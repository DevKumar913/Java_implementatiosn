package com.kumar.multithreding_impl_4;

public class SeatBooking {
	
	private int availableSeats=10;
	public synchronized void bookSeats(int requiredSeats) {
		if(availableSeats>=requiredSeats) {
			System.out.println();
			System.out.println("Seats Booked suceesfully");
			availableSeats=availableSeats-requiredSeats;
		}
		else {
			System.out.println();
			System.out.println("Requied seats are not avilable");
			System.out.println("Available Seats are : "+ availableSeats);
		}
	}

}
