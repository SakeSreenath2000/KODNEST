package com.kodnest.AccessingTheElementsStoredInTheCollectionFrameworkClassesInTheReverseOrder.Programming;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Program {
	public static void main(String[] args) {
		//Creating ArrayDeque 
		ArrayDeque ad=new ArrayDeque();
		
		//Storing the Data in the ArrayDeque
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		
		//Traversing in the Reverse Order through ArrayDeque using Iterator(i.e descendingIterator())
		Iterator ditr=ad.descendingIterator();
		while(ditr.hasNext()) {
			System.out.print(ditr.next()+" ");
		}
	}
}
