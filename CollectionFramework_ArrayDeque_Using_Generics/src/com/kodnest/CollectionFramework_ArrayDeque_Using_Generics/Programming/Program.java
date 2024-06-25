package com.kodnest.CollectionFramework_ArrayDeque_Using_Generics.Programming;

import java.util.ArrayDeque;

public class Program {
	public static void main(String[] args) {
		ArrayDeque<Character> ad=new ArrayDeque<Character>();
		ad.add('A');
		ad.add('B');
		ad.add('C');
		ad.add('D');
		ad.add('E');
		System.out.println(ad);
	}

}
