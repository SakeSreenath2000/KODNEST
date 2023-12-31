package com.kodnest.DefaultConstructor.Programming;

public class CameraApp {
	public static void main(String[] args) {
		Camera c1=new Camera();
		c1.captureImage();
		c1.displayImage();
		System.out.println(c1.color);
		System.out.println(c1.brand);
		System.out.println(c1.cost);
	}
	//Default Constructor will be added in this class
	/*If we do not write any constructor in a class then by default a "Zero-Parameterized Constructor" would be added
	into the class by Java Compiler.Thsi Constructor is technically called as "The Default Constructor" and it will be
	added to class if and only if there is no constructor in the class*/

}
