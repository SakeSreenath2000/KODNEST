package com.kodnest.ExceptionHandling_Using_UserDefinedExceptionHandlers_tryAndcatchBlocks.Programming;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try {
			System.out.println("Program execution started");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter first Number");
			int a=scan.nextInt();
			System.out.println("Enter second number");
			int b=scan.nextInt();
			int c=a/b; //Example , if a=10 and b=5 then no exception will be generated i.e output will be 2
			/*Example , if a=10 and b=0 then "ArithmeticException: / by zero" will be generated so we use "User Defined
			  Exception Handlers i.e These are try and catch Blocks to handle the Exceptions*/
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled");
		}
		System.out.println("Program execution ended");
	}

}
