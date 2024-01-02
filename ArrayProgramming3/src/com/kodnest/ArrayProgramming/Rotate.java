package com.kodnest.ArrayProgramming;

import java.util.Scanner;

public class Rotate {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the array length : ");
			int arr[] = new int[scan.nextInt()];
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.print("Enter the element "+i+" : ");
			    arr[i]=scan.nextInt();
			}
			// k will give number of rotations
			System.out.print("Enter the k value : ");
			int k=scan.nextInt();
			// Rotating the array 'k' times
			for(int i=0;i<k;i++) 
			{
			      // Storing the last element in a temporary variable
				  int s=arr[arr.length-1];
				  // Shifting every other element one position to the right
				  for(int j=arr.length-1;j>0;j--)
			        {
			            arr[j]=arr[j-1];
			        }
			        arr[0]=s;
			}
			System.out.print("Rotated Array is : ");
			for(int i=0;i<=arr.length-1;i++) 
			{
			    System.out.print(arr[i] + " ");
			}
			
	  }

}
