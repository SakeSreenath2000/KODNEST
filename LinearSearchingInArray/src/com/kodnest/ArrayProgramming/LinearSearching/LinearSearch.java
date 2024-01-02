package com.kodnest.ArrayProgramming.LinearSearching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length:");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter Key to Search:");
		int key=scan.nextInt();
		boolean flag=false; //We can also use boolean conditions for smooth and efficient way of programming
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
		
				System.out.println("Key Found at index "+i);
				//System.exit(0);-->It is very bad of way of approach because we are exiting the program in an abnormal way
				//return ;--------->It is one of good approach returns sends back the control to same place where it had come from
				flag=true;
			}
		}
		if(flag==false)
		System.out.println("Key Not Found...");
	}

}

	


		