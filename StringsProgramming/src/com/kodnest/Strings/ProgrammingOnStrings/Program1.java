package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=scan.next();//
		String s1=new String(str);
		char arr[]=s1.toCharArray();//.toCharArray is used to convert immutable string into character of array
		//for(int i=0;i<arr.length;i++)
		//{
			//System.out.println(arr[i]+" ");
		//}
		for(char s2:arr)// i.e known as "Enhanced For Loop" or "For Each Loop". i.e take
		{
			System.out.println(s2);
		}

	}

}
