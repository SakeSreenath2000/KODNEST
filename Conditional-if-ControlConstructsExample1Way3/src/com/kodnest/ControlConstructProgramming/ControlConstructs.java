package com.kodnest.ControlConstructProgramming;

import java.util.Scanner;

public class ControlConstructs {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int marks=scan.nextInt();
		System.out.println("Welcome To Kodnest");
		Check check=new Check();
		check.checkEligibility(marks);

	}

}
