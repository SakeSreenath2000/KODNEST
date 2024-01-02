package com.kodnest.Calculator.programming;

public class Calculator {
	int add(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		return a-b;
	}
	int mul(int a,int b)
	{
		return a*b;
	}
	int div(int a,int b)
	{
		return a/b;
	}
	public Calculator() { /* i.e Zero Parameterized Constructor and it is user defined so it is called as 
																	"User Defined Zero Parameterized Constructor" */
		
	}
	public Calculator(int num1,int num2) {/* i.e Two Parameterized Constructor and it is user defined so it is called 
														as "User Defined Two Parameterized Constructor" */
		//Calculator c1=new Calculator();
		//int res=c1.div(num1, num2);
		int res=div(num1, num2);
		System.out.println("Division Result is "+res);
		
	}
	

}
