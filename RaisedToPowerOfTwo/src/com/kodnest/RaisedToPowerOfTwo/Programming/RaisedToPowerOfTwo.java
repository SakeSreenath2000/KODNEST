package com.kodnest.RaisedToPowerOfTwo.Programming;

import java.util.Scanner;

public class RaisedToPowerOfTwo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=scan.nextInt();
		// Now Calling a Non static method by creating an object with classname where the method is written
		Power P=new Power();
		int res=P.raiseToTwo(n);//method call
		System.out.println(res);
	}

}
