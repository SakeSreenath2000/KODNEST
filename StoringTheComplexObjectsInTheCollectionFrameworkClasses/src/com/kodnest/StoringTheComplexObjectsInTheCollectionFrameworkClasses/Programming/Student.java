package com.kodnest.StoringTheComplexObjectsInTheCollectionFrameworkClasses.Programming;

public class Student {
	int rollNo;
	String Name;
	float Percentage;
	public Student(int rollNo, String Name, float Percentage) {
		this.rollNo = rollNo;
		this.Name = Name;
		this.Percentage = Percentage;
	}
	@Override
	public String toString() {
		return rollNo+" "+ Name+" "+Percentage;
	}
	
}
