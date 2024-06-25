package com.kodnest.ArrayProgrammingLevel2;

import java.util.Scanner;

public class OneDimensional_Array16_PrintingEvenNumbersThatArePresentInTheArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array Length");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the Elements of an Array "+i);
			arr[i]=scan.nextInt();
		}
		System.out.print("Even numbers that are present in the array are : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2 ==0)
			System.out.print(arr[i]+" ");
		}
	}

}
