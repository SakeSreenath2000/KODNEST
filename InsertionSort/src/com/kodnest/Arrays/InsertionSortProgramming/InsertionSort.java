package com.kodnest.Arrays.InsertionSortProgramming;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Array Length : ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.print("Elements Before Sorting : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//Performing Insertion Sort
		int n=arr.length;
		for(int i=1;i<=n-1;i++)
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item)//for insertionSort Ascending
			//while(j>=0 && arr[j]<item)//for insertionSort Descending
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
			
		}
		System.out.print("Elements After Sorting : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
