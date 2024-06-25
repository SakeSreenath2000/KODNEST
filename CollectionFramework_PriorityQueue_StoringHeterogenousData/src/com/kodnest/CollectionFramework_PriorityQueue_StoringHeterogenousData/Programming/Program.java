package com.kodnest.CollectionFramework_PriorityQueue_StoringHeterogenousData.Programming;

import java.util.PriorityQueue;

public class Program {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();//creation of PriorityQueue class
		pq.add(10);
		pq.add(30);
		pq.add("Java");//We cannot store Heterogenous Data in PriorityQueue class
		pq.add(98.45F);
		pq.add(true);
		pq.add('A');
		System.out.println(pq);/* Output will be an Exception "ClassCastException: class 
											java.lang.Integer cannot be cast to class java.lang.String" */
	}

}
