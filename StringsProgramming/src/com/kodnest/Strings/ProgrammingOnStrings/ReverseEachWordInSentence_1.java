package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class ReverseEachWordInSentence_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=scan.nextLine();
		System.out.println("Entered Sentence is: ");
		System.out.println(str);
		String arr[]=str.split(" "); //Splitting the sentence wherever we have spaces
		String reverseSentence=""; //Initially there is nothing present in reverseSentence
		for(int i=0;i<=arr.length-1;i++)
		{
			String word=arr[i];
			String revWord=""; //Initially there is nothing present in revWord
			char arr1[]=word.toCharArray();
			char arr2[]=new char[arr1.length];
			int k=arr2.length-1;
			for(int j=0;j<=arr2.length-1;j++) //Jth Loop is used to reverse the word
			{
				arr2[k]=arr1[j];
				k--;
			}
			revWord=new String(arr2);
			reverseSentence=reverseSentence+revWord+" "; //Add revWord to reverseSentence and store it back in reverseSentence
			
		}
		System.out.println("Revered Word Sentence is: ");
		System.out.println(reverseSentence);
	}

}
