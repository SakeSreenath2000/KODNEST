package com.kodnest.AlphabetsPatternProgramming;

public class R {
	public static void main(String[] args) {
		int n=12;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j==0 || i==0 || (j==n && i<=n/2)|| i==n/2 || i==n+j-n/2)
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