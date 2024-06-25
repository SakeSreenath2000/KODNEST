package com.kodnest.Student_ObjectCreation.Programming;

public class StudentApp {
	public static void main(String[] args) {
		//creation of Student objects
		Student s1=new Student();
		Student s2=new Student();
		//calling the methods
		s1.eat();
		s2.study();
		s1.sleep();
		s2.eat();
		//setting the values to Student "s1" object
		s1.id=1;
		s1.name="Balaji";
		s1.age=22;
		s1.branch="CS";
		//setting the values to Student "s2" object
		s2.id=2;
		s2.name="Sahana";
		s2.age=23;
		s2.branch="EC";
		//Printing the values of Student "s1" object
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.branch);
		//Printing the values of Student "s2" object
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.branch);
		
		
	}

}
