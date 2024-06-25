package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class PanaGram {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputString=scan.nextLine();
        boolean isPangram=isPangram(inputString);
        if(isPangram) 
        {
            System.out.println("The given string is a pangram.");
        } 
        else 
        {
            System.out.println("The given string is not a pangram.");
        }
    }
	 // Your code to check whether the given string is a panagram or not
    public static boolean isPangram(String str) {
        boolean arr[]=new boolean[26];
        str=str.toLowerCase();
        for (int i=0;i<str.length();i++) 
        {
            char c=str.charAt(i);
            if(c >=97 && c <=122) 
            {
                arr[c -97]=true;
            }
        }
        for (boolean b:arr) 
        {
            if (!b) 
            {
                return false;
            }
        }
        return true;
    }
}

	    

	   