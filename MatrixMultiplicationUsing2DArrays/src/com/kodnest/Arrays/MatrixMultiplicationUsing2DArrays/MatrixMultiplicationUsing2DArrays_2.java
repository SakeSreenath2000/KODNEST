package com.kodnest.Arrays.MatrixMultiplicationUsing2DArrays;

import java.util.Scanner;

public class MatrixMultiplicationUsing2DArrays_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n");
		int n=scan.nextInt();
		int arr1[][]=new int[n][n];
		int arr2[][]=new int[n][n];
		System.out.println("Enter "+(n*n)+" Array Elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				arr1[i][j]=scan.nextInt();
			}

		}
		System.out.println("Enter "+(n*n)+" Array Elements");
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2[i].length-1;j++)
			{
				arr2[i][j]=scan.nextInt();
			}

		}
		int arr3[][]=new int[n][n];
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				for(int k=0;k<=arr1.length-1;k++)
				{
					arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
				}
			}

		}
		System.out.println("MATRIX-1");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();

		}
		System.out.println("MATRIX-2");
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2[i].length-1;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();

		}
		System.out.println("MATRIX-3");
		for(int i=0;i<=arr3.length-1;i++)
		{
			for(int j=0;j<=arr3[i].length-1;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();

		}
	}//57 48 39 
	//120 102 84 
	//183 156 129 

}
