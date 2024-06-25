package com.kodnest.CollectionFramework_LinkedList_Using_Generics.Programming;

import java.util.LinkedList;

public class Program {
	public static void main(String[] args) {
		LinkedList<Boolean> ll=new LinkedList<Boolean>();
		ll.add(true);
		ll.add(false);
		ll.add(true);
		ll.add(true);
		ll.add(false);
		System.out.println(ll);
	}

}
