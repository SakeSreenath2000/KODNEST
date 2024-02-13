package com.kodnest.AbstractCarApplication.Programming;

public abstract class Car {
	void start()
	{
		System.out.println("The Car is Getting Started");
	}
	void stop()
	{
		System.out.println("The Car is Getting Stopped");
	}
	abstract void refuel();

}
