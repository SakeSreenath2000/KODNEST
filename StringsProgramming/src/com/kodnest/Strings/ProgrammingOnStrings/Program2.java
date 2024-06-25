package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=scan.next();
		StringBuffer s1=new StringBuffer(str);
		char arr[]=s1.toString().toCharArray();
		for(char s2:arr) 
		{
		    System.out.println(s2);
		}

	}

}
