package com.kodnest.Inheritance.Types.ChildSpecificMethods.Programming;

public class Circle extends Shape {
	double radius=5.5;
	double CalculateArea()
	{
		return Math.PI*radius*radius;//Math.PI gives us "π" we can't write PI directly so we imported it using "Math.PI"
		
	}
	double CalculatePerimeter()
	{
		return 2*Math.PI*radius;//Math.PI gives us "π" we can't write PI directly so we imported it using "Math.PI"
	}

}
