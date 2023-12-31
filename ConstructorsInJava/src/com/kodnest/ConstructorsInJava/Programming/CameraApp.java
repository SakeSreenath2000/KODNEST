package com.kodnest.ConstructorsInJava.Programming;

public class CameraApp {
	public static void main(String[] args) {
		Camera c1=new Camera("Black","Sony",45000);
		c1.captureImage();
		c1.displayImage();
	}

}
