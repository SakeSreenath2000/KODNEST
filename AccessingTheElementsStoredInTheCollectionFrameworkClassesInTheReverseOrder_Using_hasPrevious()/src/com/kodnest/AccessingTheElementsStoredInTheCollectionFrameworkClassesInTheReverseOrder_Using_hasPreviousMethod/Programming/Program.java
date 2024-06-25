package com.kodnest.AccessingTheElementsStoredInTheCollectionFrameworkClassesInTheReverseOrder_Using_hasPreviousMethod.Programming;

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
		
		//Traversing in the Reverse Order through ArrayList using ListIterator(i.e hasPrevious() and previous())
		ListIterator litr=al.listIterator(al.size());
		while(litr.hasPrevious()) {
			System.out.print(litr.previous()+" ");
		}
	}
}
