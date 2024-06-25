package com.kodnest.ExceptionHandlingWithMethodOverridding_RuleNo_2.Programming;

public class Child1 extends Parent{
	@Override
	public void display()  throws RuntimeException/*If Parent class method is not throwing an Exception then the child
	 					class overridden methods can throw Unchecked Exception and it cannot throw Checked Exception*/
	{
		System.out.println("Inside Child1 Class Display");
	}

}
