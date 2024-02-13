package com.kodnest.HibernateOneToManyMappingProject.Programming.HibernateOneToManyMapping_1;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	int Laptop_SerialNo;
	String Laptop_brand;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int laptop_SerialNo, String laptop_brand) {
		super();
		Laptop_SerialNo = laptop_SerialNo;
		Laptop_brand = laptop_brand;
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
	@Override
	public String toString() {
		return "Laptop [Laptop_SerialNo=" + Laptop_SerialNo + ", Laptop_brand=" + Laptop_brand + "]";
	}
	
}
