package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class FindingLengthOfStringWithoutUsingLengthMethod {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String : ");
        String str=scan.next();
        int length=findLength(str);
        System.out.println("Length of the string '" + str + "' is : " + length);
    }
	public static int findLength(String str) {
        int count=0;
        // Loop through each character in the string and increment the count
        for (char c : str.toCharArray()) 
        {
            count++;
        }
        return count;
    }

}
