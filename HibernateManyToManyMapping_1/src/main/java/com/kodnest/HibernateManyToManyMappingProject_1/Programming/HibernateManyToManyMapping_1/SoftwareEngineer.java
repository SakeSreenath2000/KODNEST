package com.kodnest.HibernateManyToManyMappingProject_1.Programming.HibernateManyToManyMapping_1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SoftwareEngineer {
	@Id
	int Id;
	String Name;
	int Age;
	public SoftwareEngineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SoftwareEngineer(int id, String name, int age) {
		super();
		Id = id;
		Name = name;
		Age = age;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
		return "SoftwareEngineer [Id=" + Id + ", Name=" + Name + ", Age=" + Age + "]";
	}
	
}
