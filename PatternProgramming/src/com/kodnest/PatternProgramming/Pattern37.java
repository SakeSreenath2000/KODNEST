package com.kodnest.PatternProgramming;

public class Pattern37 {
	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0  || j==n ||i==n )
				{
					System.out.print("*");
					//System.out.print("* "); || j==0
				} 
				else 
				{
					System.out.print(" ");
					//System.out.print(" "+" "); || i==n/2
				}
				
			}
			System.out.println();
		}
	}

}
