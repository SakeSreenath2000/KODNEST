package com.kodnest.STATIC_KEYWORD.Programming;

public class Program {
	static int a,b; //STATIC VARIABLES
	int x=100,y=200;//NON-STATIC VARIABLES (or) INSTANCE VARIABLES
	static //STATIC BLOCK
	{
		a=10;//Accessing STATIC VARIABLE
		b=20;//Accessing STATIC VARIABLE
		x=101;//Error , because not able to access NON-STATIC VARIABLE
		y=102;//Error , because not able to access NON-STATIC VARIABLE
	}
	static void display1()//STATIC METHOD
	{
		System.out.println(a);//Accessing STATIC VARIABLE
		System.out.println(b);//Accessing STATIC VARIABLE
		System.out.println(x);//Error , because not able to access NON-STATIC VARIABLE
		System.out.println(y);//Error , because not able to access NON-STATIC VARIABLE
		
	}
	
	
	{//NON-STATIC BLOCK (or) INSTANCE BLOCK
		a=11;//Accessing STATIC VARIABLE
		b=22;//Accessing STATIC VARIABLE
		x=88;//Accessing NON-STATIC VARIABLE
		y=99;//Accessing NON-STATIC VARIABLE
	}
	void display2()//NON-STATIC METHOD (or) INSTANCE METHOD
	{
		System.out.println(x);//Accessing NON-STATIC VARIABLE
		System.out.println(y);//Accessing NON-STATIC VARIABLE
		System.out.println(a);//Accessing STATIC VARIABLE
		System.out.println(b);//Accessing STATIC VARIABLE
	}
	Program()//CONSTRUCTOR
	{
		x=8888;//Accessing NON-STATIC VARIABLE
		y=9999;//Accessing NON-STATIC VARIABLE
		a=1111;//Accessing STATIC VARIABLE
		b=2222;//Accessing STATIC VARIABLE
	}
	public static void main(String[] args) //STATIC METHOD also called as MAIN METHOD
	{
		Program.display1();
		Program Pr=new Program();
		Pr.display2();
	}

}




		