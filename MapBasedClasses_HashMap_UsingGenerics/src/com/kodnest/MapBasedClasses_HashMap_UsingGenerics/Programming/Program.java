package com.kodnest.MapBasedClasses_HashMap_UsingGenerics.Programming;

import java.util.HashMap;

public class Program {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String> ();
		hm.put(1,"Mango");
		hm.put("Key-1",10);//Error
		hm.put(3,"Apple");
		hm.put(34.5F,true);//Error
		hm.put(false,48.23F);//Error
		System.out.println(hm);
	}

}
