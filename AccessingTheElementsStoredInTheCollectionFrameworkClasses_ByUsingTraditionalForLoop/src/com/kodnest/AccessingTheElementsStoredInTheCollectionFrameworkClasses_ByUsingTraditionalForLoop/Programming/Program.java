package com.kodnest.AccessingTheElementsStoredInTheCollectionFrameworkClasses_ByUsingTraditionalForLoop.Programming;

import java.util.ArrayList;

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
		
		//Traversing through ArrayList
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
	}

}
