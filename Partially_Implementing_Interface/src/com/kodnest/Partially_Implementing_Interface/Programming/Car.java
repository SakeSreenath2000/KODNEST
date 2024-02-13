package com.kodnest.Partially_Implementing_Interface.Programming;

public abstract class Car implements Vehicle {
	//Providing body for start() method 
	@Override
	public void start() {
		System.out.println("Car is Getting Started");
	}
	//Not Providing the body for stop() method
	@Override
	public abstract void stop();

}
