package com.kodnest.HibernateProject.Programming.HibernateProject1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	@Id
	int bike_engNo;
	String bike_brand;
	int bike_cost;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int bike_engNo, String bike_brand, int bike_cost) {
		super();
		this.bike_engNo = bike_engNo;
		this.bike_brand = bike_brand;
		this.bike_cost = bike_cost;
	}
	public int getBike_engNo() {
		return bike_engNo;
	}
	public void setBike_engNo(int bike_engNo) {
		this.bike_engNo = bike_engNo;
	}
	public String getBike_brand() {
		return bike_brand;
	}
	public void setBike_brand(String bike_brand) {
		this.bike_brand = bike_brand;
	}
	public int getBike_cost() {
		return bike_cost;
	}
	public void setBike_cost(int bike_cost) {
		this.bike_cost = bike_cost;
	}
	@Override
	public String toString() {
		return "Bike [bike_engNo=" + bike_engNo + ", bike_brand=" + bike_brand + ", bike_cost=" + bike_cost + "]";
	}
	

}
