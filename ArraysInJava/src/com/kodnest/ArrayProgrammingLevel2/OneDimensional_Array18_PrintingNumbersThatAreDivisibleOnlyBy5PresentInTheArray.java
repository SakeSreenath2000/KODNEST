package com.kodnest.ArrayProgrammingLevel2;

import java.util.Scanner;

public class OneDimensional_Array18_PrintingNumbersThatAreDivisibleOnlyBy5PresentInTheArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array Length");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the Elements of an Array "+i);
			arr[i]=scan.nextInt();
		}
		System.out.print("Divisible only by 5 are : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%5 ==0)
			System.out.print(arr[i]+" ");
		}

	}

}
