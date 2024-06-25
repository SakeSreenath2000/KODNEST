package com.kodnest.PatternProgramming;

public class Pattern33 {
	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || j==0 || i==n )
				{
					System.out.print("*");
					//System.out.print("* "); 
				} 
				else 
				{
					System.out.print(" ");
					//System.out.print(" "+" "); 
				}
				
			}
			System.out.println();
		}
	}


}
