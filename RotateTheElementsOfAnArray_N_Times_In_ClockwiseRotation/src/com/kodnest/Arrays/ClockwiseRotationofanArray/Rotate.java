package com.kodnest.Arrays.ClockwiseRotationofanArray;

import java.util.Scanner;

public class Rotate {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter Array Elemets ");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Before rotation array elements Are......");
	System.out.print("arr--> ");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Enter number of times array has to be rotated");
	int n=scan.nextInt();
	for(int count=1;count<=n;count++)
	{
		int temp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}	
		arr[0]=temp;
	}
	System.out.println();
	System.out.println("After rotation array elements Are......");
	System.out.print("arr--> ");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	}

}

