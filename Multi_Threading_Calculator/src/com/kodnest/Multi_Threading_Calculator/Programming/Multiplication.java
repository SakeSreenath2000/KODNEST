package com.kodnest.Multi_Threading_Calculator.Programming;

public class Multiplication extends Thread{
	public void run(int a,int b)
	{
		int c=a*b;
		System.out.println("The Multiplication of two numbers is "+c);
	}

}
