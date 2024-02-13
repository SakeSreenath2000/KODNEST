package com.kodnest.ExceptionHandlingWithMethodOverridding_RuleNo_5.Programming;

import java.io.FileNotFoundException;

public class Child1 extends Parent{
	public void display() throws FileNotFoundException /*	If Parent class method is throwing an Exception then the 
															child class overridden methods can throw different Exception
															which is not UnChecked Exception provided that there is a
															Parent Child Relationship in Between the Exceptions*/
	{
		System.out.println("Inside Child1 Class Display");
	}

}
