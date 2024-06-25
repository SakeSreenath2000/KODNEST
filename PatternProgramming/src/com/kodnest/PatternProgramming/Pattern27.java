package com.kodnest.PatternProgramming;

public class Pattern27 {
	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j==n ||i==n)
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
