package com.kodnest.TakingInputFromKeyboard.Programming;

import java.util.Scanner;

public class TakingInputFromKeyboard {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter an Integer");
		String a =scan.next();
		System.out.println("Value of a is "+a);
		System.out.println("Enter a real number");
		String b=scan.next();
		System.out.println("Value of b is "+b);
		System.out.println("Enter another real number");
		double c=scan.nextDouble();
		System.out.println("Value of c is "+c);
		System.out.println("Are you married ? Say True or False");
		boolean d=scan.nextBoolean();
		System.out.println("Value in d is "+d);
		System.out.println("Enter Insta ID");
		String e=scan.next();
		System.out.println("Value in e is "+e);
		String s=scan.nextLine();
		System.out.println("Enter your Full Name");
		String f=scan.nextLine();
		System.out.println("Value in f is "+f);
		
	}

}
