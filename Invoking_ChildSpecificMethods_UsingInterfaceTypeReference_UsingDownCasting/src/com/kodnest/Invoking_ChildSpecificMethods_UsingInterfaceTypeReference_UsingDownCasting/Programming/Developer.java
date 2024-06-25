package com.kodnest.Invoking_ChildSpecificMethods_UsingInterfaceTypeReference_UsingDownCasting.Programming;

public class Developer implements FrontEndTech{

	@Override
	public void learnHTML() {
		System.out.println("Developer is learning HTML");
	}
	
	public void learnJava() {
		System.out.println("Developer is learning Java");
	}
	

}
