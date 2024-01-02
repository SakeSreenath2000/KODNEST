package com.kodnest.ArrayProgrammingLevel1;

import java.util.Scanner;
//TWO DIMENSIONAL ARRAY
public class TwoDimensional_Array7_StoringNamesOfEachCustomerPresentInDifferentBanks {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String arr[][]=new String[5][6];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the name of Bank "+i+" Customer "+j);
				arr[i][j]=scan.next();
			}
		}
		System.out.println("Names of Customers of each Bank");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
