package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class RemoveDuplicates_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=scan.nextLine();
        String result=removeDuplicates(str);
        System.out.println("String after removing duplicates: " + result);
    }
	
	// Your code to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        char arr[]=str.toCharArray();
        int n=arr.length;
        int index=0;

        for(int i=0;i<=n-1;i++) 
        {
            int j;
            for(j=0;j<=i;j++) 
            {
                if(arr[i]==arr[j]) 
                {
                    break;
                }
            }
            if(j==i) 
            {
                arr[index++]=arr[i];
            }
        }
        return String.valueOf(arr,0,index);
        
    }
    
}
