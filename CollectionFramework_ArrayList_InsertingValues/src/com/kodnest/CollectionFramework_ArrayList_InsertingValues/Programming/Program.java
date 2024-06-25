package com.kodnest.CollectionFramework_ArrayList_InsertingValues.Programming;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();//creation of ArrayList class
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);/* For Example , if we consider "1Sec" time to add a value then it takes 
																			"5 Seconds" to add [10, 20, 30, 40, 50]*/
		al.add(2, 99);
		System.out.println(al);/* But it takes "9 Seconds" to complete inserting 99 at 2nd index because element present
		 						  at index as to shift towards right and remaining elements also should shift towards 
		 						  right so assume it takes "9 seconds" [10, 20, 99, 30, 40, 50]*/ 
		
	}/*	So We ArrayList , If data insertion should happen only at the RearEnd(BckEnd) , Because it is not efficient for
	 	storing the data at the intermediatory position*/

}
