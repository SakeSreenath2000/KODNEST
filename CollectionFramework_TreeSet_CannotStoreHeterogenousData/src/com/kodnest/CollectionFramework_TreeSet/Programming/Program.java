package com.kodnest.CollectionFramework_TreeSet.Programming;

import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		TreeSet ts1=new TreeSet();
		ts1.add(30);
		ts1.add(40);
		ts1.add("Java");//java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String
		ts1.add(48.23);//ClassCastException
		ts1.add(true);//ClassCastException
		System.out.println(ts1);//ClassCastException
		
		TreeSet<Integer> ts2=new TreeSet<Integer>();
		ts2.add(30);
		ts2.add(40);
		ts2.add("Java");//Error
		ts2.add(48.23);//Error
		ts2.add(true);//Error
								/*These Compilations errors are due to we made TreeSet as "Integer" Generic.So,it 
								 accepts only integer values and other than integer values it gives compilation errors*/
		System.out.println(ts2);
	}
}
