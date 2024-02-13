package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class ReplaceSpaceWith99Approach2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}

		}
		char arr[]=new char[str.length()+count];
		int j=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)!=' ')
			{
				arr[j]=str.charAt(i);
				j++;
			}
			else
			{
				arr[j]='9';
				j++;
				arr[j]='9';
				j++;
			}

		}
		String res=new String(arr);
		System.out.println(res);
	}

}
