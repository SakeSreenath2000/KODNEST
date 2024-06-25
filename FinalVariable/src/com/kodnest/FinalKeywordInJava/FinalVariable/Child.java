package com.kodnest.FinalKeywordInJava.FinalVariable;

public class Child extends Parent {
	void displayChild()
	{
		x=99;//Error , because final variable cannot be changed
		System.out.println("Value of x is "+x);
	}

}
