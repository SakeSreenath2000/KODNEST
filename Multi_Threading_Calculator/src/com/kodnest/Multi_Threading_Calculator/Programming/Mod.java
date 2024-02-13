package com.kodnest.Multi_Threading_Calculator.Programming;

public class Mod extends Thread{
	public void run(int a,int b)
	{
		int c=a%b;
		System.out.println("The Remainder when two numbers are divided is "+c);
	}

}
