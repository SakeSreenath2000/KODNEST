package com.kodnest.CollectionFramework_LinkedHashSet.Programming;

import java.util.LinkedHashSet;

public class Program {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(25);
		lhs.add(11);
		lhs.add(53);
		lhs.add(121);
		lhs.add(51);
		System.out.println(lhs);//Output will maintains Order of Insertion i.e [25, 11, 53, 121, 51]
	}
}
