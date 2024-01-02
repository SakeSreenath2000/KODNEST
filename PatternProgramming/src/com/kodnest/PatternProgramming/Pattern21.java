package com.kodnest.PatternProgramming;

public class Pattern21 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=2;a<=5;a++)
		{
			for(int b=1;b<=5;b++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
