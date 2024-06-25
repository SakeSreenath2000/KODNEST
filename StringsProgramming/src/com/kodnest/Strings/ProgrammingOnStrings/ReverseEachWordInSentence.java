package com.kodnest.Strings.ProgrammingOnStrings;

import java.util.Scanner;

public class ReverseEachWordInSentence {
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
			for(int j=word.length()-1;j>=0;j--) //Jth Loop is used to reverse the word
			{
				revWord=revWord+word.charAt(j); //Adding the last index value of word using word.charAt(j) to revWord and storing back in revWord
			}
			reverseSentence=reverseSentence+revWord+" "; //Add revWord to reverseSentence and store it back in reverseSentence
			
		}
		System.out.println("Revered Word Sentence is: ");
		System.out.println(reverseSentence);

	}
	
}
