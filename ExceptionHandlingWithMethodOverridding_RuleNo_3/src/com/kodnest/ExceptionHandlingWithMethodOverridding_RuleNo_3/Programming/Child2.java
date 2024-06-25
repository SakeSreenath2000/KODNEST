package com.kodnest.ExceptionHandlingWithMethodOverridding_RuleNo_3.Programming;

import java.sql.SQLException;

public class Child2 extends Parent{
	@Override
	public void display() throws SQLException /*Error ,Because if Parent class method is throwing an Exception then
	 											the child class overridden methods can throw the same Exception and it 
	 											cannot throw a different Exception*/
	{
		System.out.println("Inside Child2 Class Display");
	}

}
