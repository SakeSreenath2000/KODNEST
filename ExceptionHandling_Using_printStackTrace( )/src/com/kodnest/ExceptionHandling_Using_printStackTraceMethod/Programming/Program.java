package com.kodnest.ExceptionHandling_Using_printStackTraceMethod.Programming;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try {
			//Statements which might(may be) generate Exception
			System.out.println("Program execution started");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Numerator");
			int a=scan.nextInt();
			System.out.println("Enter Denominator");
			int b=scan.nextInt();
			int c=a/b; //Example , if a=10 and b=5 then no exception will be generated i.e output will be 2
			/*Example , if a=10 and b=0 then "ArithmeticException: / by zero" will be generated so we use "User Defined
			  Exception Handlers i.e These are try and catch Blocks to handle the Exceptions*/
			System.out.println("Division result is "+c);
			System.out.println("Enter the size to create an Array");
			int size=scan.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the element to be stored in array");
			int elem=scan.nextInt();
			System.out.println("Enter the index at which element has to stored");
			int index=scan.nextInt();
			arr[index]=elem;
			System.out.println("Element is inserted in the array");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			//Critical statements which are mandatory to be executed
			System.out.println("Program execution ended");
		}
	}

}
