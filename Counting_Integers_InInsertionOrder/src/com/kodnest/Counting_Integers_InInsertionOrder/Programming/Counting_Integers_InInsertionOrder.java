package com.kodnest.Counting_Integers_InInsertionOrder.Programming;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting_Integers_InInsertionOrder {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList();
		while(scan.hasNextInt())
		{
			int a=scan.nextInt();
			if(a==-1)
			{
				break;
			}
			al.add(a);
		}
		LinkedHashMap<Integer,Integer> tm=new LinkedHashMap();
		for(int ch:al)
		{
			tm.put(ch,tm.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Integer, Integer> me:tm.entrySet())
		{
			System.out.println(me.getKey()+" - "+me.getValue());
		}
	
	}

}
