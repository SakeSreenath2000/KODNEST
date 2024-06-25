package com.kodnest.ConCurrentModification_OR_StructuralModification.Programming;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		//ConCurrentModification (OR)StructuralModification
		//StructuralModification is the process of reading and writing the elements in the collection framework at the same time
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		int count=60;
		//traditional For Loop cannot detect the StructuralModification hence it results in infinite loop
		//infinite loop is the worst scenario in program
		for(int i=0;i<=al.size()-1;i++) {
			System.out.print(al.get(i)+" ");
			al.add(count);
			count+=10;
		}
		
	}

}
