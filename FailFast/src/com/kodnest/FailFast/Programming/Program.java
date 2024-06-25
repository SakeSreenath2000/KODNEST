package com.kodnest.FailFast.Programming;

import java.util.ArrayList;//Whenever classes are present in "util" package are considered as FailFast classes.

public class Program {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		int count=60;
		/*FailFast , It is the approach of using Advanced For Loop while performing ConCurrentModification.The Advanced
		  For Loop will be able to detect the StructuralModification and it results in ConCurrentModification Exception*/ 
		for(Object x:al) {//ConCurrentModification Exception
			System.out.print(x+" ");
			al.add(count);
			count+=10;
		}
	}
}
