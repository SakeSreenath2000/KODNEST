package com.kodnest.Interface_UsingVisibilityOfOverriddenMethods.Programming;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car is getting Started");
	}

	@Override
	void stop() //Error , because visibility cannot be decreased from "public" to "default"(i.e No Access Modifier)
	{
		System.out.println("Car is getting Stopped");
	}

}
