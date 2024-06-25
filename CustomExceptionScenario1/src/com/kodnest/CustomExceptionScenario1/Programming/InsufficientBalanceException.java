package com.kodnest.CustomExceptionScenario1.Programming;
//Custom Exception
public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException()
	{
		super("Amount is more than Balance");
	}

}
