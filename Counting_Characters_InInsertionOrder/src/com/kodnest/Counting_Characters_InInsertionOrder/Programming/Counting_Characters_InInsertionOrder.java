package com.kodnest.Counting_Characters_InInsertionOrder.Programming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting_Characters_InInsertionOrder {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		LinkedHashMap<Character,Integer> lhm=new LinkedHashMap();
		char arr[] = str.toCharArray();
		// for(char ch:str.toCharArray()) i.e we can directly write like this
		for(char ch:arr)
		{
			lhm.put(ch, lhm.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character,Integer> me:lhm.entrySet())
		{
			System.out.println(me.getKey()+" - "+me.getValue());
		}
		
	}
}
