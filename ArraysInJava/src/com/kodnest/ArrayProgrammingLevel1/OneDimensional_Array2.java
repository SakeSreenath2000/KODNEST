package com.kodnest.ArrayProgrammingLevel1;

import java.util.Scanner;

public class OneDimensional_Array2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter an element");
			arr[i]=scan.nextInt();
		}
		System.out.println("Array of Contents are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
