package com.kodnest.PatternProgramming;

public class Pattern2 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)/* j<=i is given because ith loop will take care of no of lines and jth will take care
			 						of number so if i=1 & j=1 then 1<=1(j<=i) condition satisfies and one will be printed 
			 						in first line , this process will repeat untill conditions satisfy(j<=i) i.e means
			 						how many numbers should be printed in each line will be dependent on Line Numbers*/ 
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
