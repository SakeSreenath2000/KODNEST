package com.kodnest.ProgramUsingInterface.Programming;

public class PhysicsStudent implements StudentActivites{

	@Override
	public void attendclass() {
		System.out.println("Physics Student is attending Physics Class");
	}

	@Override
	public void study() {
		System.out.println("Physics Student is studying Physics");
	}

	@Override
	public void assignment() {
		System.out.println("Physics Student is doing Physics Assignment");
	}
	

}
