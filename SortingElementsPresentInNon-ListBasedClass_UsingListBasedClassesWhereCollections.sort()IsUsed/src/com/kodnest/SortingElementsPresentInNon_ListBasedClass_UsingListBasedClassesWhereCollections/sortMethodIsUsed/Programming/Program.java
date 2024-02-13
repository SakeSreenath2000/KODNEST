package com.kodnest.SortingElementsPresentInNon_ListBasedClass_UsingListBasedClassesWhereCollections.sortMethodIsUsed.Programming;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class Program {
	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		ad.add(20);
		System.out.println("ad before sorting -->"+ad);//Output=ad before sorting -->[10, 30, 40, 50, 20]
		/*Now we need to sort the elements present in ArrayDeque , "Collections.sort()" will be used only in the list
		 			based classes , so we convert ArrayDeque elements into ArrayList by passing ArrayDeque Reference*/
		ArrayList al=new ArrayList();
		al.addAll(ad);
		Collections.sort(al);
		System.out.println("al-->"+al);//Output=after sorting al-->[10, 20, 30, 40, 50]
		/*Now we need to bring the elements which are sorted into ArrayDeque , but previously we have elements which
		  are not sorted in the ArrayDeque first we will clear them using "clear()" and then will add the elements 
		  which are sorted*/
		ad.clear();
		ad.addAll(al);
		System.out.println("ad after sorting -->"+ad);//Output=ad after sorting -->[10, 20, 30, 40, 50]
	}

}
