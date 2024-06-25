package com.kodnest.AbstractCarApplication.Programming;

public class CarApp {
	public static void doActivity(Car cr) {
		cr.start();
		cr.stop();
		cr.refuel();
	}
	public static void main(String[] args) {
		//Creating the Objects
		ElectricCar ec=new ElectricCar();
		PetrolCar pc=new PetrolCar();
		DieselCar dc=new DieselCar();
		doActivity(ec);
		doActivity(pc);
		doActivity(dc);
	}

}
