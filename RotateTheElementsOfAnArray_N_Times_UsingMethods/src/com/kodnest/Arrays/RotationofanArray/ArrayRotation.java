package com.kodnest.Arrays.RotationofanArray;

import java.util.Scanner;

public class ArrayRotation {
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
		//new Rotation().Rotate(arr, n);//clockwise rotation
		new Rotation().Rotate(n,arr);//anticlockwise rotation
		System.out.println("After rotation array elements Are......");
		System.out.print("arr--> ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
