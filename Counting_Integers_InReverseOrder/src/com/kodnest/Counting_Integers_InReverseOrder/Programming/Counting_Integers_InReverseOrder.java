package com.kodnest.Counting_Integers_InReverseOrder.Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Counting_Integers_InReverseOrder {
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
	    TreeMap<Integer,Integer> tm=new TreeMap(Collections.reverseOrder());
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
