package com.kodnest.Arrays.BinarySearchUsingSelectionSort;

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
	//Displaying Elements Before Performing Selection Sorting
	System.out.print("Elements Before Sorting : ");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	//Selection Sorting Logic *Start*
	int n=arr.length;
	for(int i=0;i<=n-2;i++)
	{
		int min = arr[i];
		int pos=i;
		for(int j=i+1;j<=n-1;j++)
		{
			if(arr[j]<min)
			{
				min=arr[j];
				pos=j;
			}
			
		}
		int help=arr[i];
		arr[i]=arr[pos];
		arr[pos]=help;
		
	}
	//Selection Sorting Logic *End*
	System.out.println();
	//Displaying elements in an array after performing Selection sorting
	System.out.print("Elements After Sorting : ");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.print("Enter Key To Search : ");
	int Key=scan.nextInt();
	int res= new SearchApp().binarySearch(arr,Key);
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
