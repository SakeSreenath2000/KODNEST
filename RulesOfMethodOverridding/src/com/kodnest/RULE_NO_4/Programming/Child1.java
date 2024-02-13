package com.kodnest.RULE_NO_4.Programming;

public class Child1 extends Parent {
	@Override//Annotation i.e used to represent overridden method
	public ElectronicDevice display()
	{
		System.out.println("Inside Child-1 class Display");
		return new ElectronicDevice();
	}


}
