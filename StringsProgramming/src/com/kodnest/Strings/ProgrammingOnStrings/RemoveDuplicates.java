package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		String str2=new String();
		for(int i=0;i<=str.length()-1;i++)
		{
			char c=str.charAt(i);
			if(str2.contains(String.valueOf(c))==false)// does not contain
			{
				str2=str2.concat(String.valueOf(c));
			}

		}
		
		System.out.println("String After Removing Dupliactes : "+str2);
		
	}

}
	
