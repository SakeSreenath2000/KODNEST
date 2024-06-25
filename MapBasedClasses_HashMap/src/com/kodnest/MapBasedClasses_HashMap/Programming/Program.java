package com.kodnest.MapBasedClasses_HashMap.Programming;

import java.util.HashMap;
//HashMap is used to store the data in "Key:Value" pair by applying "Hashing" on it.

public class Program {
	public static void main(String[] args) {
		HashMap hm1=new HashMap();
		hm1.put(11,"Java");
		hm1.put(42,"SQL");
		hm1.put(3,"HTML");
		hm1.put(21,"CSS");
		hm1.put(5,"Python");
		System.out.println(hm1);//Output={3=HTML, 21=CSS, 5=Python, 42=SQL, 11=Java}
		
		HashMap hm2=new HashMap();
		hm2.put(20,"Mango");
		hm2.put(13,20);
		hm2.put(16,true);
		hm2.put(1,true);
		hm2.put(19,48.23F);
		System.out.println(hm2);//Output={16=true, 1=true, 19=48.23, 20=Mango, 13=20}
		
		HashMap hm3=new HashMap();
		hm3.put(1,"Mango");
		hm3.put("Key-1",10);
		hm3.put(3,"Apple");
		hm3.put(34.5F,true);
		hm3.put(false,48.23F);
		System.out.println(hm3);//Output={1=Mango, Key-1=10, 3=Apple, false=48.23, 34.5=true}
		/*Output will be in Random Order because HashMap provides random output , the output will not be in sorted
		  											order (or) in the order of Insertion.It will be in Random Order*/ 
	}

}
