package com.kodnest.ExceptionHandling_FinallyBlock.Programming;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try {
			//Statements which might(may be) generate Exception
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
			//Statements to be executed after handling the exception
			System.out.println("Exception is handled");
		}
		finally {
			//Critical statements which are mandatory to be executed
			System.out.println("Program execution ended");
		}
	}


}
