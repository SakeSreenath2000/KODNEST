package com.kodnest.SpringBoot.Programming.Entities;

public class Student {
	String kodnestId;
	String name;
	int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String kodnestId, String name, int age) {
		super();
		this.kodnestId = kodnestId;
		this.name = name;
		this.age = age;
	}
	public String getKodnestId() {
		return kodnestId;
	}
	public void setKodnestId(String kodnestId) {
		this.kodnestId = kodnestId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [kodnestId=" + kodnestId + ", name=" + name + ", age=" + age + "]";
	}
	
}
