package com.kodnest.ControlConstructProgramming;
import java.util.Scanner;
public class Main {
	public static void calculateSumOfDigits(int n)
	{
	// your code here
		int sum=0;
		while(n>0)//When number is greater than zero do this process , if it becomes zero stop it
		{
			int lastdigit=n%10;//To take out the lastdigit from the entered number and keep it in "lastdigit"
			sum=sum+lastdigit;
			n=n/10;//To access the quotient 
		}
		System.out.println(sum);
	}
	public static void main(String [] args)
	{
	// your code here
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		calculateSumOfDigits(n);
	}

}
