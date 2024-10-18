package com.kumar.Task4;

import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String message) {
		super(message);
	}
}

class InvalidNameException extends Exception{
	public InvalidNameException(String message) {
		super(message);
	}
}

class UserRegisteration{
	
	public void validateName(String name) throws  InvalidNameException{
		if(name==null || name=="") {
			throw new InvalidNameException("Name should not be empty or null");
		}
		if(!Pattern.matches("[a-zA-Z]+", name)) {
			throw new InvalidNameException("Name should not have special characters or numbers , should contain only characters.");
		}
	}
	public void registerUser(String name, int age) throws InvalidAgeException , InvalidNameException{
		validateName(name);
		if(age<18) {
			throw new InvalidAgeException("Registration failed:  Age must be greater than 18 ");
		}
		System.out.println("User: "+ name+" registered succesfully");
	}
}

public class AgeValidationException {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name="";
		int age=0;
		boolean isvalid=false;
		
		while(!isvalid) {
			System.out.println("Enter your name or E to exit");
			name = sc.nextLine();
			
			if(name.equalsIgnoreCase("e")) {
				System.out.println("Exiting registration");
				break;
			}
			
			
			if(sc.hasNextInt()) {
				age=sc.nextInt();
				sc.nextLine();
			}
			
			else {
				sc.nextLine();
				throw new InvalidAgeException("Age must be an integer");
				
			}
		}
		
		
//		System.out.println("enter  User Name");
//		String name = sc.nextLine();
//		System.out.println("enter  User Age");
//		int age = sc.nextInt();
		
		UserRegisteration obj = new UserRegisteration();
		
		
		
		
		
		

	}

}
