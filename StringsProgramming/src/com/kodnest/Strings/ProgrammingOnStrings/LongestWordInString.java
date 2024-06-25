package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class LongestWordInString {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input=scan.nextLine();
        // Find and display the longest word in the input string
        String longestWord=findLongestWord(input);
        System.out.println("Longest Word : " + longestWord);
    }

    // Your code to find the longest word in a string
    public static String findLongestWord(String str) {
        String arr[]=str.split(" ");
        String longestWord="";
        for (String x : arr) 
        {
            if (x.length() > longestWord.length()) 
            {
                longestWord=x;
            }
        }
        return longestWord;
    }
    
}

