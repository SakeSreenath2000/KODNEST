package com.kodnest.SortingOfSimpleObjects_UsingTreeSetClass.Programming;

import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();//TreeSet class is used to sort the elements in ascending order
		ts.add(60);
		ts.add(10);
		ts.add(40);
		ts.add(20);
		ts.add(50);
		ts.add(30);
		System.out.println(ts);//output is [10, 20, 30, 40, 50, 60]
	}

}
