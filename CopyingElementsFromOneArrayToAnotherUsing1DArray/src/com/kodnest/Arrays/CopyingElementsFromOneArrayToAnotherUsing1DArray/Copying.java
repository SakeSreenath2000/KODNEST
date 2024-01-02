package com.kodnest.Arrays.CopyingElementsFromOneArrayToAnotherUsing1DArray;

import java.util.Scanner;

public class Copying {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array : ");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of an array : ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		int arr2[]=new int[arr1.length];
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=arr1[i];//Copying logic of arr1 elements to arr2 i.e arr1[i] give it to arr2[i]
		}
		System.out.print("Arr1 elements are : ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.print("The Copied Elements of An Array is : ");
		for(int i=0;i<=arr2.length-1;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}


}
