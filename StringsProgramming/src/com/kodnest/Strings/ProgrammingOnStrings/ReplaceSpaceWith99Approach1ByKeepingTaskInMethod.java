package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class ReplaceSpaceWith99Approach1ByKeepingTaskInMethod {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		String res=isReplace(str);
		System.out.println(res);
		
	}

	private static String isReplace(String str) {
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
		
		String res=sb.toString();
		return res;
		
	}

}
