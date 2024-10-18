package com.kumar.Optional;

import java.util.Optional;

public class Optional3 {

	public static void main(String[] args) {
		Optional<Integer> optinalNumber = Optional.ofNullable(getInteger());
		Optional<Integer> getOnlyPositive = optinalNumber.filter(n->n>0);
		
		if(getOnlyPositive.isPresent()) {
			System.out.println("Positive Number " +getOnlyPositive.get());
		}
		else {
			System.out.println("Not a positive number "+optinalNumber.get());
		}

	}
	
	public static Integer getInteger() {
		return -5;
	}

}
