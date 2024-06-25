package com.kodnest.CodeWithPolymorphisamUsingUpCasting.Programming;

public class Rectangle extends Shape{
	void draw()
	{
		System.out.println("Drawing a Rectangle Shape");
	}
	double findArea()
	{
		double length=5.0;
		double breadth=4.0;
		return length*breadth;
	}


}
