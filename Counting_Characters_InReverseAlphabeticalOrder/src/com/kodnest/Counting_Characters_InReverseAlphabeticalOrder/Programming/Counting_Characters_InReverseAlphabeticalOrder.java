package com.kodnest.Counting_Characters_InReverseAlphabeticalOrder.Programming;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Counting_Characters_InReverseAlphabeticalOrder {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
	    TreeMap<Character,Integer> tm=new TreeMap(Collections.reverseOrder());
	    char arr[] = str.toCharArray();
		// for(char ch:str.toCharArray()) i.e we can directly write like this
		for(char ch:arr)
		{
			tm.put(ch,tm.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character,Integer> me:tm.entrySet())
		{
			System.out.println(me.getKey()+" - "+me.getValue());
		}
		
	}
}
