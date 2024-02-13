package com.kodnest.CollectionFramework_PriorityQueue_StoringHomogenousData.Programming;

import java.util.PriorityQueue;

public class Program {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();//creation of PriorityQueue class
		pq.add("Java");
		pq.add("SQL");
		pq.add("HTML");
		pq.add("CSS");
		System.out.println(pq);//Here we stored Homogenous Data i.e Similar type of data(String type of data)
	}

}
