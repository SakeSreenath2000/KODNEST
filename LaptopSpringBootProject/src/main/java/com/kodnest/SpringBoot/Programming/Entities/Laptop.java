package com.kodnest.SpringBoot.Programming.Entities;

public class Laptop {
	String serialNo;
	String brand;
	int cost;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String serialNo, String brand, int cost) {
		super();
		this.serialNo = serialNo;
		this.brand = brand;
		this.cost = cost;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [serialNo=" + serialNo + ", brand=" + brand + ", cost=" + cost + "]";
	}
	
	
}
