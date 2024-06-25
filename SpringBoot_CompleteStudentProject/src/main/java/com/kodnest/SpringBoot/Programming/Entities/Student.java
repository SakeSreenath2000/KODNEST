package com.kodnest.SpringBoot.Programming.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	String RollNo;
	String Name;
	int Marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String rollNo, String name, int marks) {
		super();
		RollNo = rollNo;
		Name = name;
		Marks = marks;
	}
	public String getRollNo() {
		return RollNo;
	}
	public void setRollNo(String rollNo) {
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
