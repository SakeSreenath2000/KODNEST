package com.kodnest.RaisedToThePowerOfNumberOfDigitsInTheNumber;

import java.util.Scanner;

public class RaisedToThePowerOfNumberOfDigitsInTheNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=scan.nextInt();
		// Now Calling a Non static method by creating an object with classname where the method is written
		Power P=new Power();
		int digicount=P.Counting(num);//method call
		int res=P.raiseToPowerOfNumberOfDigitsInTheNumber(num,digicount);//method call
		System.out.println("Result when "+num+" Raised  to power "+digicount+" is "+res);
	}

}
