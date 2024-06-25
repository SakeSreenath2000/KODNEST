package com.kodnest.Boxing_And_UnBoxing.Programming;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		/*All the values stored in the ArrayList is getting stored in the format of objects by doing AutoBoxing*/
		/*Boxing is the process of converting a primitive data type value in the form of Object.If this conversion
		  													happens automatically then it is called as "AutoBoxing"*/
		al.add(10);
		al.add(20);
		al.add(45.32F);
		al.add(true);
		al.add("Java");
		al.add('A');
		System.out.println(al);
		/*UnBoxing is the process of converting an Object into the primitive data type value.If this conversion
															happens automatically then it is called as "AutoUnBoxing"*/
	/*Lets Say,if Programmer directly writes as System.out.println(al.toString()); then it is called as AutoUnBoxing*/
		/*Lets Say,if Programmer directly writes as "al.add(new Integer(10))" (or) "al.add(new String("Java"))" 
		 																					then its called as Boxing*/
	}
}
