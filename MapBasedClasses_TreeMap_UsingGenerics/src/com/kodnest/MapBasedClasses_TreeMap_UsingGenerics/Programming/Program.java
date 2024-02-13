package com.kodnest.MapBasedClasses_TreeMap_UsingGenerics.Programming;

import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1,"Mango");
		tm.put("Key-1",10);//Error
		tm.put(3,"Apple");
		tm.put(34.5F,true);//Error
		tm.put(false,48.23F);//Error
		System.out.println(tm);/*If Heterogenous keys are stored it will result in ClassCastException , If we want to
		 													have Heterogenous Keys then we should make use of Generics*/
	}
}
