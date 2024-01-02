package com.kodnest.ArrayProgrammingLevel1;

import java.util.Scanner;

public class OneDimensional_Array4_StoringTheNamesOfEmployees {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String arr[]=new String[8];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the name of Employee "+i);
			arr[i]=scan.next();
		}
		System.out.println("Names of Employees are...");
		System.out.print(" | ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i] +" | ");
		}

	}

}
