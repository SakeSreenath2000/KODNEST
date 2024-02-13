package com.kodnest.Counting_Strings_InInsertionOrder.Programming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting_Strings_InInsertionOrder {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		LinkedHashMap<String,Integer> tm=new LinkedHashMap();
		String arr[]=str.split(" ");
		//for(String ch:str.split(" ")) i.e we can also directly write like this
		for(String ch:arr) 
		{
			tm.put(ch,tm.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<String,Integer> me:tm.entrySet()) 
		{
			System.out.println(me.getKey()+"-"+me.getValue());
		}
	}

}
