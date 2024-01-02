package com.kodnest.PatternProgramming;

public class Pattern14 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)//This loop will take of number of line
		{
			for(int j=1;j<=5;j++)//It take care of printing $ five times in each line
			{
				System.out.print("$");
			}
			for(int k=1;k<=5;k++)//It take care of printing * five times in the same line which contains $(means sideByside)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
