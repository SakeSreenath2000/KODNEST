package com.kodnest.Arrays.BinarySearchUsingBubbleSortAlgorithm;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array length : ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//Displaying Elements Before Performing Bubble Sorting
		System.out.print("Elements Before Sorting : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//Bubble Sorting Logic *Start*
		int n=arr.length;
		for(int i=0;i<=n-2;i++)
		{
			for(int j=0;j<=n-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
				
			}
			
		}
		//Bubble Sorting Logic *End*
		System.out.println();
		//Displaying elements in an array after performing bubble sorting
		System.out.print("Elements After Sorting : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Enter Key To Search : ");
		int Key=scan.nextInt();
		int res= new SearchApp().binarySearch(arr, Key);
		if(res>=0)
		{
			System.out.println("Key Found At the Index "+res);
		}
		else
		{
			System.out.println("Key Not Found");
		}

	}
}