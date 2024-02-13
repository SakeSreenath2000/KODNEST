package com.kodnest.RULE_NO_3.Programming;

public class Child2 extends Parent {
	@Override//Annotation i.e used to represent overridden method
	public int display() //i.e No Error because , return type is same it does'nt care that what value it is returning
	{
		System.out.println("Inside Child2 class Display");
		return 10;
	}

}
