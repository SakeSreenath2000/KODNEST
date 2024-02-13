package com.kodnest.ExceptionHandlingWithMethodOverridding_RuleNo_2.Programming;

public class Parent {
	public void display() throws Exception /*If Parent class method is not throwing an Exception then the child class 
							overridden methods can throw Unchecked Exception and it cannot throw Checked Exception*/
	{
		System.out.println("Inside Parent Class Display");
	}

}
