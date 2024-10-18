package com.kumar.service;

import org.springframework.stereotype.Service;

@Service
public class DepositeAmount {

	public int deposite(int amount)
	{
		int bonus=10;
		System.out.println("deposite method() : DepositeAmount class");
		return bonus+amount;
	}
}