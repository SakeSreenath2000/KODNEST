package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class PrintingOneBelowtheOther {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scan.next();
		char arr[]=str.toCharArray();
		//Displaying Array Elements By Using Normal For Loop
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}

}
