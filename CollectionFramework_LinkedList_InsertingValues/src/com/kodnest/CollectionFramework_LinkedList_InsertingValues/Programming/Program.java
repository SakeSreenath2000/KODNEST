package com.kodnest.CollectionFramework_LinkedList_InsertingValues.Programming;

import java.util.LinkedList;

public class Program {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();//creation of LinkedList class
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		ll.add(2, 99);
		System.out.println(ll);
	}/*	We use LinkedList , If data insertion should happen in the Intermediatory positions*/

}
