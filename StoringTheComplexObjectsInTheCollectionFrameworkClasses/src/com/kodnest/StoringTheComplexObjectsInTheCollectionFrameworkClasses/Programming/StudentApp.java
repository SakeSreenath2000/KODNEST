package com.kodnest.StoringTheComplexObjectsInTheCollectionFrameworkClasses.Programming;

import java.util.ArrayList;

public class StudentApp {
	public static void main(String[] args) {
		//creating objects of student class
		Student st1=new Student(1,"Ajay",98.45F);
		Student st2=new Student(2,"Amit",88.23F);
		Student st3=new Student(3,"Anuj",99.56F);
		//creating ArrayList
		//ArrayList<Student> al=new ArrayList<Student>();
		/*We can also use Generics to represent which object type of data is stored , we can also write it without
		  																						using Generics also*/
		ArrayList al=new ArrayList();
		//storing the student objects in the ArrayList
		al.add(st1);
		al.add(st2);
		al.add(st3);
		//printing ArrayList to display student object details
		System.out.println(al);//internally it is written as System.out.println(al.toString());
		
	}

}
