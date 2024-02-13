package com.kodnest.SortingOfComplexObjects_UsingComparatorInterface.Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentApp_1 {
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
		
		/*Creating "Anonymous Inner Class(means "No Name Class")" in "Collections.sort()" instead of writing separate
		  class and passing reference variable here (or) by directly creating Anonymous objects instead of reference 
		  variable passing.*/ 
		Collections.sort(al,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.rollNo < o2.rollNo){
					return -1;
				}
				else if(o1.rollNo > o2.rollNo) {
					return 1;
				}
				else {
					return 0;
				}
				
			}
			
		});
		
		// printing ArrayList to display student object details after sorting
		System.out.println(al);
	}

}
