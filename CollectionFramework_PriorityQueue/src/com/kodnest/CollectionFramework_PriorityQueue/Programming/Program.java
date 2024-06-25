package com.kodnest.CollectionFramework_PriorityQueue.Programming;

import java.util.PriorityQueue;

public class Program {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();//creation of PriorityQueue class
		pq.add(40);
		pq.add(50);
		pq.add(20);
		pq.add(10);
		pq.add(30);
		System.out.println(pq);//Whenever "HighestPriorityElement"(Smallest Element) should be placed at 1st Position
	}

}
