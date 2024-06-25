package com.kodnest.ExceptionHandlingWithMethodOverridding_RuleNo_1.Programming;

public class Child1 extends Parent{

	@Override
	public void display() /*If Parent class method is throwing an Exception then the child class overridden 
											methods can throw the Exception (or) Dont't throw the Exception*/
	{
		System.out.println("Inside Child1 Class Display");
	}
	
}
