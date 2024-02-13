package com.kodnest.SortingOfSimpleObjects_UsingInBuilt_Collections.sortMethod.Programming;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(20);
		System.out.println(al);//Output before sorting is [10, 30, 40, 50, 20]
		Collections.sort(al);
		System.out.println(al);//Output after sorting is [10, 20, 30, 40, 50]
		
		
	}

}
