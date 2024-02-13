package com.kodnest.CollectionFramework_PriorityQueue_Using_Generics.Programming;

import java.util.PriorityQueue;

public class Program {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();/*creation of PriorityQueue class Using Generics to
																							store Only Integer Values*/
		pq1.add(10);
		pq1.add("Java");// Error
		pq1.add(98.45F);// Error
										/*These Compilation Errors are due to we made PriorityQueue as "Generic" which
		  																			will accept only Integers as Input*/
		pq1.add(true);// Error
		System.out.println(pq1);
		
		PriorityQueue<String> pq2 = new PriorityQueue<String>();/*creation of PriorityQueue class Using Generics to
																	 					store Only String Values*/
		pq2.add(10);// Error
		pq2.add("Java");
		pq2.add(98.45F);// Error
										/*These Compilation Errors are due to we made PriorityQueue as "Generic" which
		 																			will accept only Strings as Input*/
		pq2.add(true);// Error
		System.out.println(pq2);

	}

}
