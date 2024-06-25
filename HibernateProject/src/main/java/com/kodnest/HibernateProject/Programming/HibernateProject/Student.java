package com.kodnest.HibernateProject.Programming.HibernateProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	int RollNo;
	String Name;
	int Marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, int marks) {
		super();
		RollNo = rollNo;
		Name = name;
		Marks = marks;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", Name=" + Name + ", Marks=" + Marks + "]";
	}

}
