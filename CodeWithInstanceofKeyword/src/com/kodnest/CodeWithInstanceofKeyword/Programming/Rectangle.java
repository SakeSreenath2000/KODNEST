package com.kodnest.CodeWithInstanceofKeyword.Programming;

public class Rectangle extends Shape{
	double length=6.0;
	double breadth=4.0;
	double findArea()
	{
		return length*breadth;
	}
	double findRectanglePerimeter()
	{
		return 2*(length+breadth);
	}



}
