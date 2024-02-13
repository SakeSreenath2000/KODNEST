package com.kodnest.ManagingAnException_3_DuckingAnException.Programming;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try {
			System.out.println("Calculation is Started");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter first number");
			int a=scan.nextInt();
			System.out.println("Enter second number");
			int b=scan.nextInt();
			divide(a,b);
		}
		catch(Exception e){
			System.out.println("Exception is handled in the main method");
		}
		System.out.println("Calculation is ended");
		
	}
	public static void divide(int a, int b) throws Exception //Ducking An Exception
	{
			int divres=a/b;
			System.out.println("Division result is "+divres);
	}

}
