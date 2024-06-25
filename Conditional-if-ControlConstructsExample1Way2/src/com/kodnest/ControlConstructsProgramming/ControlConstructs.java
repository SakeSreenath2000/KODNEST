package com.kodnest.ControlConstructsProgramming;

import java.util.Scanner;

public class ControlConstructs {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int marks=scan.nextInt();
		System.out.println("Welcome To Kodnest");
		demo(marks);
		
	}
	public static void demo(int marks) 
	{
		//Simple if Conditional Control Construct 
		if(marks >=80) 
		{
			System.out.println("Welcome To Tech Club");
		}
		
	}

}
