package com.kodnest.UsageOfInbuiltMathpowMethod.Programming;

import java.util.Scanner;

public class UsageOfInbuiltMathpowMethod {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num and n values:");
		int num=scan.nextInt();
		int n=scan.nextInt();
		/*Math.pow(double num , double n) is of double data type and it is an inbuilt class which is written by james 
		 gosling and if we want to use its result by converting it as "int" data type we have to explicitly tell as 
		 like below */
		int res=(int)Math.pow(num, n);//Explicit Type Casting
		System.out.println(res);
	}

}
