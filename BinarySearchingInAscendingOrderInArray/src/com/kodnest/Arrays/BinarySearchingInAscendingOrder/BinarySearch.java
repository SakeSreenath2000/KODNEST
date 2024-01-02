package com.kodnest.Arrays.BinarySearchingInAscendingOrder;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array Length :");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the Key : "); 
		int key=scan.nextInt();
		int res=Binary(arr,key);
		
		if(res >=0)
		{
			System.out.println("Key Found At "+res+" Index...");
		}
		else {
			System.out.println("Key Not Found...");
		}
		
	}
	public static int Binary(int arr[],int key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
				//high=high;--->we can skip this statement there is no problem
			}
			else
			{
				high=mid-1;
				//low=low;----->we can skip this statement there is no problem
			}
		}
		return -1;
		
	}


	
}
