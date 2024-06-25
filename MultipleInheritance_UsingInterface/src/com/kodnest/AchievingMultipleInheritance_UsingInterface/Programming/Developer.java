package com.kodnest.AchievingMultipleInheritance_UsingInterface.Programming;

public class Developer implements FrontEndTech,BackEndTech{

	@Override
	public void learnJava() {
		System.out.println("Developer is learning Java");
	}

	@Override
	public void learnHTML() {
		System.out.println("Developer is learning HTML");
	}

}
