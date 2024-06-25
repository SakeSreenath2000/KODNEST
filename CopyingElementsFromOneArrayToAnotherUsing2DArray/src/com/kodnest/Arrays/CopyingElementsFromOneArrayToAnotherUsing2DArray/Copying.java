package com.kodnest.Arrays.CopyingElementsFromOneArrayToAnotherUsing2DArray;

import java.util.Scanner;

public class Copying {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the lengths of 2D Array : ");
		int arr1[][]=new int[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter the elements of an array : ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1.length-1;j++)
			{
				arr1[i][j]=scan.nextInt();
			}
		}
		int arr2[][]=new int[arr1.length][arr1.length];
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				arr2[i][j]=arr1[i][j];//Copying logic of arr1 elements to arr2 i.e arr1[i][j] give it to arr2[i][j]
			}
			
		}
		System.out.println("2D Arr1 elements are : ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1.length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("The Copied Elements of An 2D Array is : ");
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
