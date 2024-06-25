package com.kodnest.PatternProgramming;

public class Pattern19 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=1;a<=5;a++)
		{
			for(int b=5;b>=a;b--)
			{
				System.out.print(" ");
			}
			for(int c=5;c>=a;c--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
