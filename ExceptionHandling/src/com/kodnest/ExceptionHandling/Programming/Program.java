package com.kodnest.ExceptionHandling.Programming;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("Program execution started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first Number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		int c=a/b; //Example , if a=10 and b=5 then no exception will be generated i.e output will be 2
		//Example , if a=10 and b=0 then "ArithmeticException: / by zero" will be generated
		System.out.println(c);
		System.out.println("Program execution ended");
	}

}
