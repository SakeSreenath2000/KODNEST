package com.kodnest.ArrayProgrammingLevel1;

import java.util.Scanner;

public class ThreeDimensional_Array14_TakingTheLengthAsInputAndCreatingTheArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of 3 Dimension Regular array");
		int arr[][][]=new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];//Creating 3D regular Array
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter an element");
					arr[i][j][k]=scan.nextInt();
				}
			}

		}
		System.out.println("Array Contents are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
