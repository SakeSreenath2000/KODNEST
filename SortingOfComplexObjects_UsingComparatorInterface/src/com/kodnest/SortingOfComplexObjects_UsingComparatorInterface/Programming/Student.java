package com.kodnest.SortingOfComplexObjects_UsingComparatorInterface.Programming;

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
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", Percentage=" + Percentage + "]";
	}
}
