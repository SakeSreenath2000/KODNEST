package com.kodnest.Inheritance.Types.ChildSpecificMethods.Programming;

public class Shape {
	void draw()
	{
		System.out.println("Drawing a Shape");
	}
	double CalculateArea()
	{
		return 0.0;/*Here 0.0 is returned because shape is not defined to calculate area , so
		 																	we simply returned double value*/
	}

}
