package com.kodnest.ArrayProgrammingLevel1;
import java.util.Scanner;
public class OneDimensional_Array11_TakingTheLengthAsInputAndCreatingTheArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Taking Array Length As Input From The User
		System.out.println("Enter Array Length");
		//int len=scan.nextInt();
		//int arr[]=new int[len];
		int arr[]=new int[scan.nextInt()];  //Creating 1D Array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter an Array Elements");
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Contents are...");
		System.out.print(" | ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" | ");
		}

	}

}
