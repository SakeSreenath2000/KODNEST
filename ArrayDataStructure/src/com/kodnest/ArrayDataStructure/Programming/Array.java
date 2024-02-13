package com.kodnest.ArrayDataStructure.Programming;

import java.util.Scanner;

public class Array {
	private int arr[]=null;
	private Scanner scan=new Scanner(System.in);
	public Array(int n) 
	{
		arr=new int[n];
	}
	public void insert()
	{
		System.out.println("Enter the position from 0 to "+(arr.length-1)+" in which element has to be Inserted");
		int pos=scan.nextInt();
		System.out.println("Enter the element that has to be Inserted");
		int element=scan.nextInt();
		arr[pos]=element;
		
	}
	public void delete()
	{
		System.out.println("Enter the position from 0 to "+(arr.length-1)+"in which element has to be deleted");
		int pos=scan.nextInt();
		arr[pos]=0;
		
	}
	public void display()
	{
		for(int i:arr)
		System.out.println(i);
		
	}
	

}
