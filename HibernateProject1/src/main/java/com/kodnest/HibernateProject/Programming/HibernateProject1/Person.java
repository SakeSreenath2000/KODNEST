package com.kodnest.HibernateProject.Programming.HibernateProject1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	int person_id;
	String person_name;
	int person_age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int person_id, String person_name, int person_age) {
		super();
		this.person_id = person_id;
		this.person_name = person_name;
		this.person_age = person_age;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public int getPerson_age() {
		return person_age;
	}
	public void setPerson_age(int person_age) {
		this.person_age = person_age;
	}
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", person_name=" + person_name + ", person_age=" + person_age + "]";
	}
	

}
