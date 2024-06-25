package com.kodnest.ExceptionHandlingWithMethodOverridding_RuleNo_3.Programming;

import java.io.IOException;

public class Parent {
	public void display() throws IOException /*	If Parent class method is throwing an Exception then the child class 
												overridden methods can throw the same Exception and it cannot throw a 
												different Exception*/
	{
		System.out.println("Inside Parent Class Display");
	}

}
