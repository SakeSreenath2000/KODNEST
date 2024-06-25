package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String arr[]=new String[scan.nextInt()];
		System.out.println("Enter the Char");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.next();
		}
		System.out.println("output");
		for(String s1:arr)
		{
			System.out.println(s1);
		}
		
	}

}
