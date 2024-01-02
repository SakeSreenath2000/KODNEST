package com.kodnest.ArrayProgrammingLevel2;

import java.util.Scanner;

public class OneDimensional_Array21_SummingAllTheElementsOfAnArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array : ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of an array : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.print("Elements of an Array are : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println();
		System.out.print("The Sum of Elements of An Array is : "+sum);
	}

}
