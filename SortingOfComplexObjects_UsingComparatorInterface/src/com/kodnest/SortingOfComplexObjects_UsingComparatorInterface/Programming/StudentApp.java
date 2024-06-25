package com.kodnest.SortingOfComplexObjects_UsingComparatorInterface.Programming;

import java.util.ArrayList;
import java.util.Collections;

public class StudentApp {
	public static void main(String[] args) {
		// creating objects of student class
		Student st1 = new Student(2, "Ajay", 98.45F);
		Student st2 = new Student(1, "Amit", 88.23F);
		Student st3 = new Student(3, "Anuj", 99.56F);
		
		// creating ArrayList
		// ArrayList<Student> al=new ArrayList<Student>();
		/*We can also use Generics to represent which object type of data is stored ,
													we can also write it without using Generics also*/
		ArrayList al = new ArrayList();
		// storing the student objects in the ArrayList
		al.add(st1);
		al.add(st2);
		al.add(st3);
		// printing ArrayList to display student object details
		System.out.println(al);// internally it is written as System.out.println(al.toString());
		//creating the object of SortingHelper class in which compare() is present
		SortingHelper sh=new SortingHelper();
 		
		// Sorting of the objects present in the ArrayList
		// sort(al,sh) internally calls the compare() present in the SortingHelper class
		Collections.sort(al,sh);
		
		/*Collections.sort(al,new SortingHelper()); i.e we can also use Anonymous Objects(because SortingHelper class 
		 is used only once here), which will be used only once and does not have any reference variable.So we can write
		 directly like this for making the code more efficient*/
		
		// printing ArrayList to display student object details after sorting
		System.out.println(al);

	}

}
