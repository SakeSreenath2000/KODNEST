package com.kodnest.FinalKeywordInJava.FinalVariable;

public class Parent {
	final int x=10;
	void displayParent()
	{
		x=55;//Error , because final variable cannot be changed
		System.out.println("Value of x is "+x);
	}

}
