package com.kodnest.RaisedToThePowerOfNumberOfDigitsInTheNumber;

import java.util.Scanner;

public class RaisedToThePowerOfNumberOfDigitsInTheNumber{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=scan.nextInt();
		// Now Calling a Non static method by creating an object with classname where the method is written
		DigitsCount Dc=new DigitsCount();
		int n=Dc.Counting(num);
		Power P=new Power();
		int res=P.raiseToPowerOfNumberOfDigitsInTheNumber(num,n);//method call
		System.out.println("Result when "+num+" Raised  to power "+n+" is "+res);
	}


}
