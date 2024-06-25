package com.kodnest.SpringFramework.Programming.SpringProject1;

public class Student {
	int RollNo;
	String Name;
	int Age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, int age) {
		super();
		RollNo = rollNo;
		Name = name;
		Age = age;
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
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", Name=" + Name + ", Age=" + Age + "]";
	}

}
