package com.kodnest.methodsProgramming;

import java.util.Scanner;

public class TheStringJoinerDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter str1 and str2 ");
		String str1=scan.next();
		String str2=scan.next();
		System.out.println("The result of joining two given Strings is "+joinStrings(str1,str2));
		
	}
	public static String joinStrings(String str1, String str2) {
		return str1 + str2;
	}

}
