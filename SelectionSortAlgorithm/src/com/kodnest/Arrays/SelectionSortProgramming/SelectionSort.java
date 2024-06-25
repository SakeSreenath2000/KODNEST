package com.kodnest.Arrays.SelectionSortProgramming;

import java.util.Scanner;

public class SelectionSort {
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
		System.out.println();
		//Selection Sort Logic
		int n=arr.length;
		for(int i=0;i<=n-2;i++)
		{
			int min = arr[i];
			int pos = i;
			for(int j=i+1;j<=n-1;j++)
			{
				if(arr[j]<min)//for SelectionSortAscending
				//if(arr[j]>min)//for SelectionSortDescending
				{
					min=arr[j];
					pos=j;
				}
				
			}
			//swapping arr[i] and arr[j]
			int help = arr[i];
			arr[i]=arr[pos];
			arr[pos]=help;
			
		}
		System.out.print("Elements After Sorting : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
