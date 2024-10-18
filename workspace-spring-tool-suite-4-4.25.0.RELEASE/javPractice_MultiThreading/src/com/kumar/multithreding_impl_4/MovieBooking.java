package com.kumar.multithreding_impl_4;

public class MovieBooking extends Thread{
	
	private static SeatBooking seatBooking;
	private int seats;
	
	public void run() {
		//System.out.println(Thread.currentThread().getName());
		seatBooking.bookSeats(seats);
	}
	
	public static void main(String args[]) {
		seatBooking = new SeatBooking();
		MovieBooking t1 = new MovieBooking();
		
		t1.seats=7;
		t1.start();
		
		MovieBooking t2 = new MovieBooking();
		
		t2.seats=5;
		t2.start();
	}
}
