package com.kodnest.Interface_DemoExample.Programming;

public interface DemoInterface {
	
	//public abstract method
	void display1();
	
	//default concrete method
	default void display2()
	{
		System.out.println("Inside default Method");
	}
	
	//Static Concrete Method
	static void display3()
	{
		System.out.println("Inside static display3 method");
	}
	
	//private concrete method
	private void display4()
	{
		System.out.println("Inside private display4 method");
	}

}
