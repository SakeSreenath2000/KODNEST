package com.kodnest.ExceptionHandlingWithMethodOverridding_RuleNo_2.Programming;

public class Child2 extends Parent{
	@Override
	public void display()  throws IOException/*	Error , Because if Parent class method is not throwing an Exception then
	 											the child class overridden methods can throw Unchecked Exception and it 
	 											cannot throw Checked Exception*/
	{
		System.out.println("Inside Child2 Class Display");
	}

}
