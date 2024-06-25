package com.kodnest.RULE_NO_4.Programming;

public class Child2 extends Parent {
	@Override//Annotation i.e used to represent overridden method
	public Laptop display()//No Error , because different return is allowed , because of Co-variant return type.
						//Co-variant return types are such return types which have parent and child relationship
	{
		System.out.println("Inside Child-2 class Display");
		return new Laptop();
	}


}
