package com.kumar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kumar.helper.HelperService;

@Service
public class WithdrawAmount {
	
	public int withdrawalTransaction()
	{
		System.out.println("WithdrawalTransaction() :  WithdrawAmount class");
		withdrawal();    //switch between advices by making comment this.
		return 100;
	}
	
	public void withdrawal()
	{

		throw new ArithmeticException("EXCEPTION NEED TO HANDLE.");
	}
}
