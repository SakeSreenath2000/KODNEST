package com.kodnest.ProgramUsingInterface.Programming;

public class StudentApp {
	public static void doActivites(StudentActivites sa) {
		sa.attendclass();
		sa.study();
		sa.assignment();
		
	}
	public static void main(String[] args) {
		PhysicsStudent ps=new PhysicsStudent();
		ChemistryStudent cs=new ChemistryStudent();
		doActivites(ps);
		doActivites(cs);
		
	}

}
