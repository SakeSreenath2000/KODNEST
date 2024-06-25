package com.kodnest.Error.Programming;

public class Program {
	static void display()
	{
		display();/* It generates , Exception in thread "main" java.lang.StackOverflowError
											at com.kodnest.Error.Programming.Program.display(Program.java:6)*/
	}
	public static void main(String[] args) {
		display();
	}

}
