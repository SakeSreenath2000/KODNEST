package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class ReplaceSpaceWith99Approach1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		StringBuffer sb=new StringBuffer();
		String arr[]=str.split(" ");
		for(int i=0;i<=arr.length-1;i++)
		{
			sb.append(arr[i]);
			if(i!=arr.length-1)
			{	
				sb.append(99);
			}
		}
		
		System.out.println(sb);
		
	}
	
}
