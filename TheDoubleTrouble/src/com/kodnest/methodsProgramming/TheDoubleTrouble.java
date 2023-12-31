package com.kodnest.methodsProgramming;

import java.util.Scanner;

public class TheDoubleTrouble {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the integer");
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num*2));

	}
	public static int doubleTheNumber(int num){
		return num;
	}
	
}

