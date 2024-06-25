package com.kodnest.ObjectOrientation.FanApp.Programming;

public class Fan {
	int no_of_wings;
	int cost;
	String color;
	String brand;
	void rotate() {
		System.out.println(color + " color " +brand+ " brand " +no_of_wings+ " winged fan is Rotating which is the cost of " +cost+ " is rotating");
	}
	void blow_Air() {
		System.out.println(color+ " color Fan is Blowing Air...");
	}

}
