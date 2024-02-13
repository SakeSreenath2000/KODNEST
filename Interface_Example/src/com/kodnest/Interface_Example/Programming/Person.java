package com.kodnest.Interface_Example.Programming;
//public class Person implements Developer,Tester extends Musician i.e It is not allowed 
public class Person extends Musician implements Developer,Tester//It is Allowed
{

	@Override
	public void testing() {
		System.out.println("Person is Testing");
	}

	@Override
	public void coding() {
		System.out.println("Person is Coding");
	}

}
