package com.kodnest.Recursion.Programming;

import java.util.Scanner;

public class theGCD {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of m and n to find GCD :");
		int m=scan.nextInt();
		int n=scan.nextInt();
		GCD HCF=new GCD();
		int res=HCF.gcd(m, n);
		System.out.println("The Gcd of m and n is : "+res);
		
	}


}
