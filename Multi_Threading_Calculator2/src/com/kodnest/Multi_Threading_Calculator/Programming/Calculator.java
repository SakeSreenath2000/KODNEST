package com.kodnest.Multi_Threading_Calculator.Programming;

public class Calculator implements Runnable {
	public void run() {
		if(Thread.currentThread().getName().equals("add"))
		{
			add();
		}
		else if(Thread.currentThread().getName().equals("sub"))
		{
			sub();
		}
		else if(Thread.currentThread().getName().equals("mul"))
		{
			mul();
		}
		else if(Thread.currentThread().getName().equals("div"))
		{
			div();
		}
		else {
			mod();
		}

		
	}
	public void add() {
		int a=10;
		int b=5;
		int c=a+b;
		System.out.println("The Addition of two numbers is "+c);
	}
	public void sub() {
		int a=10;
		int b=5;
		int c=a-b;
		System.out.println("The Substraction of two numbers is "+c);
	}
	public void mul() {
		int a=10;
		int b=5;
		int c=a*b;
		System.out.println("The Multiplication of two numbers is "+c);
	}
	public void div() {
		int a=10;
		int b=5;
		int c=a/b;
		System.out.println("The Division of two numbers is "+c);
	}
	public void mod() {
		int a=10;
		int b=5;
		int c=a%b;
		System.out.println("The Remainder when two numbers are divided is "+c);
	}
	
}
