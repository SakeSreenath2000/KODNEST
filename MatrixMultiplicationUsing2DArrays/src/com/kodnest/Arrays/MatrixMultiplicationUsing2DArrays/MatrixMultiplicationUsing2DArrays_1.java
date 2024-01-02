package com.kodnest.Arrays.MatrixMultiplicationUsing2DArrays;

import java.util.Scanner;

public class MatrixMultiplicationUsing2DArrays_1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lengths of 2D array");
		int arr1[][]=new int[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter the Elements of Array 1 :");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1.length-1;j++)
			{
				arr1[i][j]=scan.nextInt();
			}

		}
		System.out.println("Enter the Elements of Array 2 :");
		int arr2[][]=new int[arr1.length][arr1.length];
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				arr2[i][j]=scan.nextInt();
			}

		}
		//Creating arr3 and Performing Matrix Multiplication
		int arr3[][]=new int[arr1.length][arr1.length];
		//Logic of Matrix Multiplication
		for(int i=0;i<=arr3.length-1;i++)
		{
			for(int j=0;j<=arr3[i].length-1;j++)
			{
				for(int k=0;k<=arr3.length-1;k++)
				{
					arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
					//Above is the Matrix Multiplication Logic of Two Different Arrays
				}
			}

		}
		//Displaying the Arrays Now
		System.out.println("2D Arr1 Elements are :");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1.length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();

		}
		System.out.println("Elements of an 2D Array2 are :");
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();

		}
		System.out.println("The resulted array after Matrix Multiplication :");
		for(int i=0;i<=arr3.length-1;i++)
		{
			for(int j=0;j<=arr3.length-1;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();

		}
	}

}
