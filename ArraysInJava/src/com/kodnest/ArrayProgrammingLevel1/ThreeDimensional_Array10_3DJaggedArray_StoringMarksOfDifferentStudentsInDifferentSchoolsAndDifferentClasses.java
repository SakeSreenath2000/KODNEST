package com.kodnest.ArrayProgrammingLevel1;

import java.util.Scanner;

public class ThreeDimensional_Array10_3DJaggedArray_StoringMarksOfDifferentStudentsInDifferentSchoolsAndDifferentClasses {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][][]=new int[2][][];
		
		arr[0]=new int[2][];
		arr[1]=new int[3][];
		
		arr[0][0]=new int[3];
		arr[0][1]=new int[4];
				
		arr[1][0]=new int[3];
		arr[1][1]=new int[2];
		arr[1][2]=new int[4];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter The Marks Of School "+i+" Class "+j+" Student "+k);
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		
		System.out.println("Array Contents Are....");
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
