package com.kodnest.Interface_PublicStaticFinalVariables.Programming;

public class Car implements Vehicle{

	@Override
	public void stop() {
		speed=300; // Error , Because final variable value cannot be changed (or) reassigned
		System.out.println("Car is getting stopped from the speed "+Vehicle.speed);
	}

}
