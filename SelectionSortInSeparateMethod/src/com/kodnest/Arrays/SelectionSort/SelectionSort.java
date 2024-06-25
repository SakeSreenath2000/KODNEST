package com.kodnest.Arrays.SelectionSort;

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
		new Sorting().SortApp(arr);
		System.out.print("Elements After Sorting : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}


}
