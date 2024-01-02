package com.kodnest.ControlConstructProgramming;

public class CalculateSum {
		public void calculateSumOfDigits(int n)	{
		int sum=0;
		while(n>0)
		{
			int ld=n%10;
			sum=sum+ld;
			n=n/10;
		}
		System.out.println("Sum of digits is "+sum);
		
	}

}
