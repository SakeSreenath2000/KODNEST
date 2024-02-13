package com.kodnest.MapBasedClasses_TreeMap.Programming;

import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		TreeMap tm1=new TreeMap();
		tm1.put(1,"Java");
		tm1.put(4,"SQL");/*Here we are storing Homogenous data(String data type) and
		 					keys are also of Integer type which is also Homogenous */
		tm1.put(3,"HTML");
		tm1.put(2,"CSS");
		tm1.put(5,"Python");
		System.out.println(tm1);//Output={1=Java, 2=CSS, 3=HTML, 4=SQL, 5=Python}
		
		TreeMap tm2=new TreeMap();
		tm2.put(1,"Mango");
		tm2.put(4,20);/*Here we are storing Homogenous data(String,Integer,boolean,float data type) and
													keys are of Integer type which is also Homogenous */
		tm2.put(3,10);
		tm2.put(2,true);
		tm2.put(5,48.23F);
		System.out.println(tm2);//Output={1=Mango, 2=true, 3=10, 4=20, 5=48.23}
		
		TreeMap tm3=new TreeMap();
		tm3.put(1,"Mango");
		tm3.put("Key-1",20);/*Here we are storing Heterogenous data(String,Integer,boolean,float data type) and
										keys are also of Heterogenous type.So it generates ClassCastException */
		tm3.put(3,10);
		tm3.put(34.5F,true);
		tm3.put(false,48.23F);
		System.out.println(tm3);//ClassCastException will be Generated because as said in above reason.
		// java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String
	}

}
