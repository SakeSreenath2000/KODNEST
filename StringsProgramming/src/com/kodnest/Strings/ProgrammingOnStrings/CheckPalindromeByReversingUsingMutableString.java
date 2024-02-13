package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class CheckPalindromeByReversingUsingMutableString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1=scan.next();
		System.out.println("Input String : "+s1);
		StringBuffer s2=new StringBuffer(s1);
		StringBuffer rev=s2.reverse();
		System.out.println("Reversed String : "+rev);
		if(s2.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
