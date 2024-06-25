package com.kodnest.ProgramUsingInterface.Programming;

public class ChemistryStudent implements StudentActivites{
	
	@Override
	public void attendclass() {
		System.out.println("Chemistry Student is attending Chemistry Class");
	}

	@Override
	public void study() {
		System.out.println("Chemistry Student is studying Chemistry");
	}

	@Override
	public void assignment() {
		System.out.println("Chemistry Student is doing Chemistry Assignment");
	}

}
