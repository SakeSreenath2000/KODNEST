package com.kodnest.MapViews_keySetMethod_valuesMethod_entrySetMethod.Programming;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(1,10);
		tm.put(3,30);
		tm.put(2,20);
		tm.put(5,50);
		tm.put(4,40);
		System.out.println(tm);//Output={1=10, 2=20, 3=30, 4=40, 5=50}
		
		//Accessing only and only keys
		Set keys=tm.keySet();
		for(Object x:keys) {
			System.out.print(x+" ");//Output=1 2 3 4 5
		}
		System.out.println();
		
		//Accessing only and only values
		Collection values=tm.values();
		for(Object x:values) {
			System.out.print(x+" ");//Output=10 20 30 40 50 
		}
		System.out.println();
		
		//Accessing both keys and values
		Set keys_values=tm.entrySet();
		for(Object x:keys_values) {
			System.out.print(x+" ");//Output: 1=10 2=20 3=30 4=40 5=50 
		}
	}

}
