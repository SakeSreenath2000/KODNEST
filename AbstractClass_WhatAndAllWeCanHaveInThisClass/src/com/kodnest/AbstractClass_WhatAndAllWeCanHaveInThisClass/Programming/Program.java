package com.kodnest.AbstractClass_WhatAndAllWeCanHaveInThisClass.Programming;

public abstract class Program {
	
	static int x,y;//Static Variables
	
	static //Static Block
	{
		x=10;
		y=20;
	}
	
	static void display1() //Static Method
	{
		System.out.println(x+" "+y);
	}
	
	int a=11,b=22; //Non-Static Variables
	
	{ //Non-Static Block
		
		System.out.println("Non-Static Block");
	}
	
	void display2() //Non-Static Concrete Method
	{
		System.out.println(a+" "+b);
	}
	
	abstract void display3(); //Abstract Method
	
	public static abstract void display4(); //Error,Because we cannot have static-abstract Method inside Abstract Class
	
	Program() //Constructor
	{
		System.out.println("Inside Constructor");
	}
	
	public static void main(String[] args) { //Main Method
		Program.display1();
		Program pr=new Program(); //Error,Because we cannot create the object of abstract class
		pr.display2();
	}

}
