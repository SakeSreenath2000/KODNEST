package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class PrintingOneBelowtheOtherUsingForEachLoop {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scan.next();
		char arr[]=str.toCharArray();
		//Displaying Array Elements By Using For Each Loop
		for(char x:arr)
		{
			System.out.println(x);
		}
		
	}

}
