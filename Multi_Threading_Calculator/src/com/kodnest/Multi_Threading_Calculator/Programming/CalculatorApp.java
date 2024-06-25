package com.kodnest.Multi_Threading_Calculator.Programming;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Addition ad=new Addition();
		Substraction sb=new Substraction();
		Multiplication ml=new Multiplication();
		Division dn=new Division();
		Mod rm=new Mod();
		ad.start();
		sb.start();
		ml.start();
		dn.start();
		rm.start();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First Value");
		int a=scan.nextInt();
		System.out.println("Enter the Second Value");
		int b=scan.nextInt();
		
		
	}

}
