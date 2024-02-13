package com.kodnest.AccessingTheElementsStoredInTheCollectionFrameworkClasses_ByUsingTraditionalForLoop.Programming;

import java.util.ArrayDeque;

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
		
		//Traversing through ArrayDeque
		for(int i=0;i<=ad.size()-1;i++) {
			System.out.println(ad.get(i));/*Error , Because we don't have inbuilt get() in ArrayDeque,TreeSet and 
											PriorityQueue because in these classes we don't have index values rather
											the elements will be stored without assigning the index values.So without
											index values we cannot get them by using get() */
		}
		
	}
	
}
