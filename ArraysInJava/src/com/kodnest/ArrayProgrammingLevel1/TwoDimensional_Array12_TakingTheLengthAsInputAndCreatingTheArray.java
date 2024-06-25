package com.kodnest.ArrayProgrammingLevel1;

import java.util.Scanner;

public class TwoDimensional_Array12_TakingTheLengthAsInputAndCreatingTheArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1D and 2D lengths");
		int arr[][]=new int[scan.nextInt()][scan.nextInt()]; //Creating 2D Regular Array
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter an Array Elements");
				arr[i][j]=scan.nextInt();
			}
			
		}
		System.out.println("Array Contents are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
