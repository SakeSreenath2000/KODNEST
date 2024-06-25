package com.kodnest.CollectionFramework_ArrayDeque_InsertingValues.Programming;

import java.util.ArrayDeque;

public class Program {
	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();//creation of ArrayDeque class
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		System.out.println(ad);
		ad.addFirst(99);
		System.out.println(ad);//ArrayDeque is used to store data at the FrontEnd or RearEnd
		ad.addLast(88);
		System.out.println(ad);
	}

}
