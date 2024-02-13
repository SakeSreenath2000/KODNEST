package com.kodnest.Recursion.Programming;

import java.util.Scanner;

public class FactorialApplication {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to find Factorial:");
		int n=scan.nextInt();
		Factorial factorial=new Factorial();
		int res=factorial.fact(n);
		System.out.println(res);
	}

}
