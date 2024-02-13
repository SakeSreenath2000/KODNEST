package com.kodnest.ExceptionHandlingWithMethodOverridding_RuleNo_4.Programming;

public class Child2 extends Parent{
	@Override
	public void display() throws ArrayIndexOutOfBoundsException /*	If Parent class method is throwing an Exception then
	 																the child class overridden methods can throw the 
	 																same Exception (or) a different Exception provided 
	 																that they are Unchecked Exception*/
	{
		System.out.println("Inside Child2 Class Display");
	}

}
