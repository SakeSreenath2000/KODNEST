package com.kodnest.Arrays.RotationofanArray;

public class Rotation {
	public static void Rotate(int arr[],int n) {
		//Logic for ClockWise Rotation of an Array
		for(int count=1;count<=n;count++)
		{
			int temp=arr[arr.length-1];
			for(int i=arr.length-2;i>=0;i--)
			{
				arr[i+1]=arr[i];
			}	
			arr[0]=temp;
		}
	
	}
	public static void Rotate(int n,int arr[]) {//Method Overloading i.e method names are same "Rotate" but different in Signature
		//Logic for AntiClockWise Rotation of an Array
		for(int count=1;count<=n;count++)
		{
			int temp=arr[0];
			for(int i=1;i<=arr.length-1;i++)
			{
				arr[i-1]=arr[i];
			}	
			arr[arr.length-1]=temp;
		}
	
	}

}