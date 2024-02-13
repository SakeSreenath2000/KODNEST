package com.kodnest.MapBasedClasses_LinkedHashMap_UsingGenerics.Programming;

import java.util.LinkedHashMap;

public class Program {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(1,"Mango");
		lhm.put("Java",10);//Error
		lhm.put(34.5F,"Apple");//Error
		lhm.put(5,"Sree");
		lhm.put('A',10);//Error
		System.out.println(lhm);
	}
}
