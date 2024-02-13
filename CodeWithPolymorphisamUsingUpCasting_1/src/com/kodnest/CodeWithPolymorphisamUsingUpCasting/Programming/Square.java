package com.kodnest.CodeWithPolymorphisamUsingUpCasting.Programming;

public class Square extends Shape{
	void draw()
	{
		System.out.println("Drawing a Square Shape");
	}
	double findArea()
	{
		double s1=4.0;
		double s2=4.0;
		return s1*s2;
	}


}
