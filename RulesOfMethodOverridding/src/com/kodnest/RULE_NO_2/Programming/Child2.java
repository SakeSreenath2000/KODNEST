package com.kodnest.RULE_NO_2.Programming;

public class Child2 extends Parent {
	@Override//Annotation i.e used to represent overridden method
	void display() //i.e Error because , visibility cannot be reduced and its different access modifier
	{
		System.out.println("Inside Child2 class Display");
	}
	

}
