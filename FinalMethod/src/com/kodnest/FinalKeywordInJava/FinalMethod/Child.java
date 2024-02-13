package com.kodnest.FinalKeywordInJava.FinalMethod;

public class Child extends Parent {
	void display()//Error because cannot override the final method from Parent
	{
		System.out.println("This is a Child class Method");
	}

}
