package com.kodnest.FailSafe.Programming;

import java.util.concurrent.CopyOnWriteArrayList;/*Whichever classes are present in "concurrent" package are 
																					considered as FailSafe classes.*/
public class Program {
	public static void main(String[] args) {
		CopyOnWriteArrayList cwal=new CopyOnWriteArrayList();
		cwal.add(10);
		cwal.add(20);
		cwal.add(30);
		cwal.add(40);
		cwal.add(50);
		int count=60;
		//FailSafe 
		for(Object x:cwal) {
			System.out.print(x+" ");
			cwal.add(count);
			count+=10;
		}
		System.out.println();
		System.out.println(cwal);
	}

}
