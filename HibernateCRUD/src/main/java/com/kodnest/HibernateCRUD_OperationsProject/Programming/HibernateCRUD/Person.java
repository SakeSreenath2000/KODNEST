package com.kodnest.HibernateCRUD_OperationsProject.Programming.HibernateCRUD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	int Person_Id;
	String Person_Name;
	int Person_Age;
	String Person_Email;
	long Person_PhoneNo;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int person_Id, String person_Name, int person_Age, String person_Email, long person_PhoneNo) {
		super();
		Person_Id = person_Id;
		Person_Name = person_Name;
		Person_Age = person_Age;
		Person_Email = person_Email;
		Person_PhoneNo = person_PhoneNo;
	}
	public int getPerson_Id() {
		return Person_Id;
	}
	public void setPerson_Id(int person_Id) {
		Person_Id = person_Id;
	}
	public String getPerson_Name() {
		return Person_Name;
	}
	public void setPerson_Name(String person_Name) {
		Person_Name = person_Name;
	}
	public int getPerson_Age() {
		return Person_Age;
	}
	public void setPerson_Age(int person_Age) {
		Person_Age = person_Age;
	}
	public String getPerson_Email() {
		return Person_Email;
	}
	public void setPerson_Email(String person_Email) {
		Person_Email = person_Email;
	}
	public long getPerson_PhoneNo() {
		return Person_PhoneNo;
	}
	public void setPerson_PhoneNo(long person_PhoneNo) {
		Person_PhoneNo = person_PhoneNo;
	}
	@Override
	public String toString() {
		return "Person [Person_Id=" + Person_Id + ", Person_Name=" + Person_Name + ", Person_Age=" + Person_Age
				+ ", Person_Email=" + Person_Email + ", Person_PhoneNo=" + Person_PhoneNo + "]";
	}
	

}
