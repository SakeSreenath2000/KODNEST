package com.kodnest.RULE_NO_3.Programming;

public class Child1 extends Parent {
	@Override//Annotation i.e used to represent overridden method
	protected float display() //Error , because return type is changed
	{
		System.out.println("Inside Child1 class Display");
		return 5.5F;
	}
	

}
