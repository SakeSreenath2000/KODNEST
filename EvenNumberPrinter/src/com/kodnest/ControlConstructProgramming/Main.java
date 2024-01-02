package com.kodnest.ControlConstructProgramming;

import java.util.Scanner;

public class Main {
	public static void printEvenNumbers(int n){
		for(int i=1;i<=n;i++)
		{
			if(i % 2 ==0) 
			{
				System.out.print(i +" ");
			}
		}


	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printEvenNumbers(n);

	}

}
