package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class PrintingArrayElementsOneBelowtheOtherUsingForEachLoop {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length:");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements:");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("The elements are...");
		//Displaying Array Elements By Using For Each Loop
		for(int x:arr)
		{
			System.out.println(x);
		}
		
	}

}
