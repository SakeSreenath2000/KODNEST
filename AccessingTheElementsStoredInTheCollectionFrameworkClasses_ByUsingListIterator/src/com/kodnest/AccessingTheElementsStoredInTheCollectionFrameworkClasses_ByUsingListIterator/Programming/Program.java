package com.kodnest.AccessingTheElementsStoredInTheCollectionFrameworkClasses_ByUsingListIterator.Programming;

import java.util.ArrayList;
import java.util.ListIterator;

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
		
		//Traversing through ArrayList using ListIterator
		ListIterator litr=al.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
	}
}
