package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class CountingVCDSC_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input=scan.nextLine();
        countCharacters(input);
    }
	//i.e code to count vowels, consonants, digits, and special characters
    public static void countCharacters(String str) {
        str=str.toLowerCase();
        int vowels=0,consonants=0,digits=0,specialCharacters=0;
        for(int i=0;i<=str.length()-1;i++) 
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z') 
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
                {
                    vowels++;
                } else 
                {
                    consonants++;
                }
            } 
            else if(ch>='0' && ch<='9') 
            {
                digits++;
            } 
            else 
            {
                specialCharacters++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialCharacters);
        
    }

}
