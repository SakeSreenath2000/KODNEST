package com.kodnest.CodeWithInstanceofKeyword.Programming;

public class Circle extends Shape {
	double radius=5.0;
	double findArea()
	{
		return Math.PI*radius*radius;
	}
	double findCirclePerimeter()
	{
		return 2*Math.PI*radius;
	}



}
