package com.kodnest.PatternProgramming;

public class Pattern40 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			char x='A';
			for(int j=1;j<=5;j++)
			{
				System.out.print(x);
				x++;//Increment x value i.e means 66,67,68,69 it means it will print B,C,D,E
			}
			System.out.println();
		}	
	}

}
