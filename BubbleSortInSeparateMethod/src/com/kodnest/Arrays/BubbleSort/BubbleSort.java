package com.kodnest.Arrays.BubbleSort;

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
		new Sorting().SortApp(arr);
		System.out.println();
		//Displaying elements after bubble sort
		System.out.print("Elements After Bubble Sort : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}


}
