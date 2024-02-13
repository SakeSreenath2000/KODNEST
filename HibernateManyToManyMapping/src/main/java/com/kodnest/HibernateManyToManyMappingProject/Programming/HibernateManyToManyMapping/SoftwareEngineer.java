package com.kodnest.HibernateManyToManyMappingProject.Programming.HibernateManyToManyMapping;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class SoftwareEngineer{
	@Id
	int Id;
	String Name;
	int Age;
	@ManyToMany
	List<Technology> tech;
	public SoftwareEngineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SoftwareEngineer(int id, String name, int age, List<Technology> tech) {
		super();
		Id = id;
		Name = name;
		Age = age;
		this.tech = tech;
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
	public List<Technology> getTech() {
		return tech;
	}
	public void setTech(List<Technology> tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "SoftwareEngineer [Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", tech=" + tech + "]";
	}
	
}