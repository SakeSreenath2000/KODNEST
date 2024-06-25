package com.kodnest.MapBasedClasses_LinkedHashMap.Programming;

import java.util.LinkedHashMap;
public class Program {
	public static void main(String[] args) {
		LinkedHashMap lhm1=new LinkedHashMap();
		lhm1.put(11,"Java");
		lhm1.put(42,"SQL");
		lhm1.put(3,"HTML");
		lhm1.put(21,"CSS");
		lhm1.put(5,"Python");
		System.out.println(lhm1);//Output={11=Java, 42=SQL, 3=HTML, 21=CSS, 5=Python}
		
		LinkedHashMap lhm2=new LinkedHashMap();
		lhm2.put(1,"Mango");
		lhm2.put(4,20);
		lhm2.put(3,10);
		lhm2.put(2,true);
		lhm2.put(5,48.23F);
		System.out.println(lhm2);//Output={1=Mango, 4=20, 3=10, 2=true, 5=48.23}
		
		LinkedHashMap lhm3=new LinkedHashMap();
		lhm3.put(1,"Mango");
		lhm3.put("Key-1",20);
		lhm3.put(3,"Apple");
		lhm3.put(34.5F,true);
		lhm3.put(false,48.23F);
		System.out.println(lhm3);//Output={1=Mango, Key-1=20, 3=Apple, 34.5=true, false=48.23}
	}

}
