package com.kodnest.ControlConstructProgramming;

public class Palindrome {
	public void isPalindrome(int n)
	{
		int original=n;
		int reverse=0;
		while(n>0)//When number is greater than zero do this process , if it becomes zero stop it
		{
			int lastdigit=n%10;//To take out the lastdigit from the entered number and keep it in "lastdigit"
			reverse=reverse*10+lastdigit;
			n=n/10;//To access the quotient 
			
		}
		if(original==reverse)
		{
			System.out.println("true");
			//System.out.println("Entered Number is Palindrome");
		}
		else
		{
			System.out.println("false");
			//System.out.println("Entered Number is Not Palindrome");
		}
	}

}
