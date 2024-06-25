package com.kodnest.CollectionFramework_ArrayDeque.Programming;

import java.util.ArrayDeque;

public class Program {
	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque(); //Creation of ArrayDeque class
		ad.add(10);
		ad.add(20);
		ad.add("Java");
		ad.add(98.45);
		ad.add(true);
		System.out.println(ad);
	}

}
