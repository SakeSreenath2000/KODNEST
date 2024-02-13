package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class LongestUniqueSubstring {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.nextLine();
        System.out.println("All substrings of the string are: ");
        for(int i=0;i<=str.length()-1;i++) 
        {
            for(int j=i+1;j<=str.length();j++) 
            {
                System.out.println(str.substring(i,j));
                
            }
            
        }
        findSubString(str);
	}
	public static void findSubString(String str)
	{
		String max="";
		for(int i=0;i<=str.length()-1;i++) 
        {
            for(int j=i+1;j<=str.length();j++) 
            {
                String Substring=str.substring(i,j);
                boolean res=isUnique(Substring);
                if(res==true)
                {
                	if(Substring.length()>max.length())
                    {
                    	max=Substring;
                    }
                	
                }
                
            }
            
        }
		System.out.println("Longest Unique SubString is "+max);
		 
	}
	public static boolean isUnique(String s)
	{
		for(int i=0;i<=s.length()-1;i++) 
        {
            for(int j=i+1;j<=s.length()-1;j++) 
            {
            	if(s.charAt(i)==s.charAt(j))
        		{
        			return false;
        		}
            	
            }
        }
		return true;
		
	}

}
