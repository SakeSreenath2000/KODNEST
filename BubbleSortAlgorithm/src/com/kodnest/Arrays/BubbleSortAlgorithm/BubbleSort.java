package com.kodnest.Arrays.BubbleSortAlgorithm;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the array length : ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//displaying elements before bubble sort
		System.out.print("Elements Before Bubble Sort : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//Performing BubbleSort
		int n=arr.length;
		for(int i=0;i<=n-2;i++)
		{
			for(int j=0;j<=n-2-i;j++)
			{
				if(arr[j]>arr[j+1])//for BubbleSortAscending
				//if(arr[j]<arr[j+1])//for BubbleSortDescending
				{
					//Swapping Condition
					 int swap= arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=swap;
				}
			}
		}
		System.out.println();
		//Displaying elements after bubble sort
		System.out.print("Elements After Bubble Sort : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
