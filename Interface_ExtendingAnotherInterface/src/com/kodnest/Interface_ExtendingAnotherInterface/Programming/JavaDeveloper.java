package com.kodnest.Interface_ExtendingAnotherInterface.Programming;

public class JavaDeveloper implements BackEndDeveloper{

	@Override
	public void coding() {
		System.out.println("Java Developer is Coding");
	}

	@Override
	public void backEndProject() {
		System.out.println("Java Developer is doing BackEndProject");
	}

}
