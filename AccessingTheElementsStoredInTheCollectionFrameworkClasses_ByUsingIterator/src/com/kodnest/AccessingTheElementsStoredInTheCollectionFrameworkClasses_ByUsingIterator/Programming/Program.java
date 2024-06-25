package com.kodnest.AccessingTheElementsStoredInTheCollectionFrameworkClasses_ByUsingIterator.Programming;

import java.util.ArrayList;
import java.util.Iterator;

public class Program {
	public static void main(String[] args) {
		//Creating ArrayList 
		ArrayList al=new ArrayList();
		
		//Storing the Data in the ArrayList
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		//Traversing through ArrayList using Iterator
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
	
}
