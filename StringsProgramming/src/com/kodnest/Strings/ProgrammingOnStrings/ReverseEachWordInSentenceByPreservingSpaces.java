package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class ReverseEachWordInSentenceByPreservingSpaces {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1=scan.nextLine();
		System.out.println("Input String : "+s1);
		char arr1[]=s1.toCharArray();
		char arr2[]=new char[arr1.length];
		//First we will copy the spaces present in arr1 to arr2 in which place they present in arr1 exactly to same place in arr2
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]==' ')
			{
				arr2[i]=arr1[i];
			}
		}
		//Logic for Reversing the String
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]!=' ')
			{
				if(arr2[j]==' ')
				{
					j--;
				}
				if(arr2[j]!=' ')
				{
					arr2[j]=arr1[i];
					j--;
				}
				
			}
				
		}
		String s2=new String(arr2);
		System.out.println("Reversed String By Presering Spaces : "+s2);
		
	}

}
