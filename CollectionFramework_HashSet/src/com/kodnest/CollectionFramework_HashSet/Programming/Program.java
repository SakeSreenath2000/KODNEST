package com.kodnest.CollectionFramework_HashSet.Programming;

import java.util.HashSet;

public class Program {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(25);
		hs.add(11);
		hs.add(53);
		hs.add(121);
		hs.add(51);
		System.out.println(hs);//Output will be in Random Order i.e [51, 53, 25, 121, 11]
	}

}
