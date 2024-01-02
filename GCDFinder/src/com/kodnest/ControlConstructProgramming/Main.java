package com.kodnest.ControlConstructProgramming;

import java.util.Scanner;

public class Main {
	public static void findGCD(int a, int b){
		int m=36,n=60;
		int rem;
		int gcd;
		while(n!=0)
		{
			rem=m%n;
			m=n;
			n=rem;
			
		} 
		gcd = m;
		System.out.println(gcd);
		
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		findGCD(36, 60);

	}

}
