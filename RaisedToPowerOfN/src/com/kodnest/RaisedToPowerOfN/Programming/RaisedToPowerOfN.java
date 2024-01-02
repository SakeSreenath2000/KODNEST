package com.kodnest.RaisedToPowerOfN.Programming;

import java.util.Scanner;

public class RaisedToPowerOfN {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=scan.nextInt();
		System.out.println("Enter a number to which power it has to be Raised: ");
		int n=scan.nextInt();
		// Now Calling a Non static method by creating an object with classname where the method is written
		Power P=new Power();
		int res=P.raiseToPowerN(num,n);//method call
		System.out.println(res);
	}

}
