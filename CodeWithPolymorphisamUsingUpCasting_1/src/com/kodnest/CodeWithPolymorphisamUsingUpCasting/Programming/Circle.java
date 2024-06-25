package com.kodnest.CodeWithPolymorphisamUsingUpCasting.Programming;

public class Circle extends Shape{
	void draw()
	{
		System.out.println("Drawing a Circle Shape");
	}
	double findArea()
	{
		double radius=5.0;
		return Math.PI*radius*radius;
	}


}
