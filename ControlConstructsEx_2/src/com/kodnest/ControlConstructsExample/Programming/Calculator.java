package com.kodnest.ControlConstructsExample.Programming;

public class Calculator {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		sub(a,b);
		System.out.println("Calculation is Completed");
		
	}

	public static void sub(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
}
