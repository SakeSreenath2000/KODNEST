package com.kodnest.SpringFramework.Programming.SpringProject3;

public class Laptop {
	int SerialNo;
	String Brand;
	float Cost;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int serialNo, String brand, float cost) {
		super();
		SerialNo = serialNo;
		Brand = brand;
		Cost = cost;
	}
	public int getSerialNo() {
		return SerialNo;
	}
	public void setSerialNo(int serialNo) {
		SerialNo = serialNo;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public float getCost() {
		return Cost;
	}
	public void setCost(float cost) {
		Cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [SerialNo=" + SerialNo + ", Brand=" + Brand + ", Cost=" + Cost + "]";
	}
	
}
