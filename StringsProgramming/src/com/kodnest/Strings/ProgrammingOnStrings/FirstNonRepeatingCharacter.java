package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input=scan.nextLine();
        char result=findFirstNonRepeatingChar(input);
        if (result != '\0') 
        {
            System.out.println("The first non-repeating character is : " + result);
        } 
        else 
        {
            System.out.println("No non-repeating character found in the string.");
        }
        
    }
	public static char findFirstNonRepeatingChar(String str) {
		 char arr[]=str.toCharArray();
	        for(int i=0;i<=arr.length-1;i++) 
	        {
	            boolean isDuplicate=false;
	            for(int j=0;j<=arr.length-1;j++) 
	            {
	                if(i != j && arr[i]==arr[j]) 
	                {
	                    isDuplicate=true;
	                    break;
	                }
	            }
	            if(!isDuplicate) 
	            {
	                return arr[i];
	            }
	        }
	        return '\0';
	  }
	
}

	       

