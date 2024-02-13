package com.kodnest.AccessingTheElementsStoredInTheCollectionFrameworkClasses_ByUsingAdvancedForLoop.Programming;

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
		
		//Traversing through ArrayDeque using AdvancedForLoop (OR) ForEachLoop (or) EnhancedForLoop
		for(Object x:ad) {
			System.out.print(x+" ");
		}
	}
}
