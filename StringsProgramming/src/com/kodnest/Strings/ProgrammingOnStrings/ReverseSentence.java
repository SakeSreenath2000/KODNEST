package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=scan.nextLine();
		System.out.println("Entered Sentence is : "+str);
		String arr[]=str.split(" ");
		String arr1[]=new String[arr.length];
		StringBuffer fs=new StringBuffer();
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			arr1[j]=arr[i];
			fs.append(arr1[j]+" ");
			j++;
			
		}
		System.out.println("Reverse Sentence is : "+fs.toString());
	}

}
