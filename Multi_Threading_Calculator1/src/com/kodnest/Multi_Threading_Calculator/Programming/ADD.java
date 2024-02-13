package com.kodnest.Multi_Threading_Calculator.Programming;

public class ADD implements Runnable{
	@Override
	public void run() {
		int a=10;
		int b=5;
		int c=a+b;
		System.out.println(c);
		
	}

}
