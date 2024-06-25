package com.kodnest.HibernateManyToOneBiDirectionalMappingProject.Programming.HibernateMany2OneBidirectionalMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop{
	@Id
	int Laptop_SerialNo;
	String Laptop_brand;
	@ManyToOne
	Student st;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int laptop_SerialNo, String laptop_brand, Student st) {
		super();
		Laptop_SerialNo = laptop_SerialNo;
		Laptop_brand = laptop_brand;
		this.st = st;
	}
	public int getLaptop_SerialNo() {
		return Laptop_SerialNo;
	}
	public void setLaptop_SerialNo(int laptop_SerialNo) {
		Laptop_SerialNo = laptop_SerialNo;
	}
	public String getLaptop_brand() {
		return Laptop_brand;
	}
	public void setLaptop_brand(String laptop_brand) {
		Laptop_brand = laptop_brand;
	}
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	@Override
	public String toString() {
		return "Laptop [Laptop_SerialNo=" + Laptop_SerialNo + ", Laptop_brand=" + Laptop_brand + ", st=" + st + "]";
	}
	
}
