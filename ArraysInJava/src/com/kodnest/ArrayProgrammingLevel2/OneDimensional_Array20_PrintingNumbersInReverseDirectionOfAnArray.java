package com.kodnest.ArrayProgrammingLevel2;

import java.util.Scanner;

public class OneDimensional_Array20_PrintingNumbersInReverseDirectionOfAnArray {
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
		//int j=arr1.length-1;---------------------->we can use this logic and can reverse the array
		for(int i=0;i<=arr1.length-1;i++)
		{
			//arr2[j]=arr1[i];---------------------->If we use above commented logic then we should give elements present in arr1[i] to arr2[i]
			//j--;---------------------------------->we should also decrement the j value to store the values of arr1[i] in reverse direction
			arr2[i]=arr1[arr1.length-1-i]; //This another logic where we use only one variable "i"
	
		}
		System.out.print("Arr1 elements are : ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.print("The Reversed Elements of An Array is : ");
		for(int i=0;i<=arr2.length-1;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}

}
