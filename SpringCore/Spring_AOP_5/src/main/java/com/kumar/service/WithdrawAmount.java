package com.kumar.service;

import org.springframework.stereotype.Service;

@Service
public class WithdrawAmount {
	
	public double withdrawal(int amount)
	{
		int charges = 10;
		System.out.println("withdrawal(..) : WithdrawAmount class");
		return amount+charges;
	}
}
