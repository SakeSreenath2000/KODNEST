package com.kodnest.STATIC_KEYWORD.Programming;

public class Program {
	static int a,b; //STATIC VARIABLES
	static //STATIC BLOCK
	{
		System.out.println("Inside the Static Block");
		a=10;
		b=20;
	}
	static void display1()//STATIC METHOD
	{
		System.out.println("Inside the Static Method");
		System.out.println(a);//Accessing STATIC VARIABLE
		System.out.println(b);//Accessing STATIC VARIABLE
	}
	int x,y;//NON-STATIC VARIABLES (or) INSTANCE VARIABLES
	
	{//NON-STATIC BLOCK (or) INSTANCE BLOCK
		System.out.println("Inside the Non-Static Block");
	}
	void display2()//NON-STATIC METHOD (or) INSTANCE METHOD
	{
		System.out.println("Inside the Non-Static Method");
		System.out.println(x);//Accessing NON-STATIC VARIABLE
		System.out.println(y);//Accessing NON-STATIC VARIABLE
		System.out.println(a);//Accessing STATIC VARIABLE
		System.out.println(b);//Accessing STATIC VARIABLE
	}
	Program()//CONSTRUCTOR
	{
		x=70;//Accessing NON-STATIC VARIABLE
		y=80;//Accessing NON-STATIC VARIABLE
		System.out.println("Inside the Constructor");
	}
	public static void main(String[] args) //STATIC METHOD also called as MAIN METHOD
	{
		Program.display1();
		Program P=new Program();
		P.display2();
	}

}
