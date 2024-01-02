package com.kodnest.ControlConstructProgramming;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Palindrome Pd=new Palindrome();
		Pd.isPalindrome(n);
	}

}
