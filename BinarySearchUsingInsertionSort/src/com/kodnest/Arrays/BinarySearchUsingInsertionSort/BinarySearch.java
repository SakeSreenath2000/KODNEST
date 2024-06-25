package com.kodnest.Arrays.BinarySearchUsingInsertionSort;

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
		//Insertion Sorting Logic *Start*
		int n=arr.length;
		for(int i=1;i<=n-1;i++)
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		//Insertion Sorting Logic *End*
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
