package com.kodnest.PatternProgramming;

public class Pattern10 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)/*Starts from j=5 means in first line print 5 stars and in next j-- and print 
																			paricular number of stars in each line*/
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
