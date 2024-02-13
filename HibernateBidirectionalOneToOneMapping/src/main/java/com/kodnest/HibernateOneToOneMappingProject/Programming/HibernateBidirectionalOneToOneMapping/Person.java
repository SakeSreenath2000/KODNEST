package com.kodnest.HibernateOneToOneMappingProject.Programming.HibernateBidirectionalOneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	int person_id;
	String person_name;
	int person_age;
	@OneToOne
	Bike bike;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int person_id, String person_name, int person_age, Bike bike) {
		super();
		this.person_id = person_id;
		this.person_name = person_name;
		this.person_age = person_age;
		this.bike = bike;
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
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", person_name=" + person_name + ", person_age=" + person_age
				+ ", bike=" + bike + "]";
	}
	

}

