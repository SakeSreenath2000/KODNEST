package com.kodnest.DefaultConstructor.Programming;

public class Camera {
	String color;
	String brand;
	int cost;
	void captureImage() {
		System.out.println("Image Captured...");
	}
	void displayImage() {
		System.out.println("Display the Image...");
	}
	//Default Constructor will be added in this class
	/*If we do not write any constructor in a class then by default a "Zero-Parameterized Constructor" would be added
	 into the class by Java Compiler.Thsi Constructor is technically called as "The Default Constructor" and it will be
	 added to class if and only if there is no constructor in the class*/
}
