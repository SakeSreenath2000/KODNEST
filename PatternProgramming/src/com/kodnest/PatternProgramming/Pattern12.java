package com.kodnest.PatternProgramming;

public class Pattern12 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int m=1;m<=5;m++)
		{
			for(int k=5;k>=m;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
