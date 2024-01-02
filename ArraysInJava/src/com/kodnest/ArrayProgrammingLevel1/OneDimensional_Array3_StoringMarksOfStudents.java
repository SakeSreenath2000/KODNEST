package com.kodnest.ArrayProgrammingLevel1;

import java.util.Scanner;

public class OneDimensional_Array3_StoringMarksOfStudents {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter Marks of Student " +i);
			arr[i]=scan.nextInt();
		}
		System.out.println("Marks of Students are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" | ");
		}

	}

}
