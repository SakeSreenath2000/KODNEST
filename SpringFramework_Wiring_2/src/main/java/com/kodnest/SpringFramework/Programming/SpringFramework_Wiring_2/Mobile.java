package com.kodnest.SpringFramework.Programming.SpringFramework_Wiring_2;

public class Mobile {
	String Mob_Brand;
	int Mob_Cost;
	int Mob_Ramsize;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String mob_Brand, int mob_Cost, int mob_Ramsize) {
		super();
		Mob_Brand = mob_Brand;
		Mob_Cost = mob_Cost;
		Mob_Ramsize = mob_Ramsize;
	}
	public String getMob_Brand() {
		return Mob_Brand;
	}
	public void setMob_Brand(String mob_Brand) {
		Mob_Brand = mob_Brand;
	}
	public int getMob_Cost() {
		return Mob_Cost;
	}
	public void setMob_Cost(int mob_Cost) {
		Mob_Cost = mob_Cost;
	}
	public int getMob_Ramsize() {
		return Mob_Ramsize;
	}
	public void setMob_Ramsize(int mob_Ramsize) {
		Mob_Ramsize = mob_Ramsize;
	}
	@Override
	public String toString() {
		return "Mobile [Mob_Brand=" + Mob_Brand + ", Mob_Cost=" + Mob_Cost + ", Mob_Ramsize=" + Mob_Ramsize + "]";
	}
	
}
