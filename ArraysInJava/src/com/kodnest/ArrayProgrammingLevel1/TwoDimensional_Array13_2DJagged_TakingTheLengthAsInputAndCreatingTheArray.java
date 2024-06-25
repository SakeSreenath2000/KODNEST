package com.kodnest.ArrayProgrammingLevel1;

import java.util.Scanner;

public class TwoDimensional_Array13_2DJagged_TakingTheLengthAsInputAndCreatingTheArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Two Dimension jagged array
		System.out.println("Enter the length of 1st Dimension");
		int arr[][]=new int[scan.nextInt()][];
		//2nd Dimension Array Creation Logic
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter 2nd Dimension length for 1st Dimension "+i);
			arr[i]=new int[scan.nextInt()];
		}
		//Storing logic
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter an element");
				arr[i][j]=scan.nextInt();
			}
		}
		//Displaying Logic
		System.out.println("Array Contents are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
