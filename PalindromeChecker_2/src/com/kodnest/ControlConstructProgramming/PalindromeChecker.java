package com.kodnest.ControlConstructProgramming;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scan.nextInt();
		Palindrome Pd=new Palindrome();
		int res=Pd.isPalindrome(n);
		if(res==n)
		{
			System.out.println("Entered Number is a Palindrome");
		}
		else
		{
			System.out.println("Entered Number is Not a Palindrome");
		}
	}

}
