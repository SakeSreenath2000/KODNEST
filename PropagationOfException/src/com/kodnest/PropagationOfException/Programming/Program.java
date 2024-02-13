package com.kodnest.PropagationOfException.Programming;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("Calculation is Started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		multiply(a,b);
		System.out.println("Calculation is ended");
		
	}
	public static void multiply(int a, int b) {
		System.out.println("Multiplication is Started");
		int mulres=a*b;
		System.out.println("Multiplication result is "+mulres);
		divide(a,b);
		System.out.println("Multiplication is ended");
		
	}
	public static void divide(int a, int b) {
		System.out.println("Division is Started");
		int divres=a/b;
		System.out.println("Division result is "+divres);
		System.out.println("Division is ended");
	}

}
