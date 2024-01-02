package com.kodnest.ToCountTheNumberOfDigits;

import java.util.Scanner;

public class ToCountTheNumberOfDigits {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=scan.nextInt();
		// Now Calling a Non static method by creating an object with classname where the method is written
		DigitsCount DC= new DigitsCount();//i.e DC means Digits Count
		int res=DC.Counting(num);//Method Call
		System.out.println("Number of digits present in "+num+" is "+res);
	}

}
