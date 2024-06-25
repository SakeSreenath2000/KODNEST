package com.kodnest.Inheritance.Types.ChildSpecificMethods.Programming;

public class ShapeApp {
	public static void main(String[] args) {
		Circle cr=new Circle();
		//Calling Inherited Method
		cr.draw();
		//Calling Overridden Method
		System.out.println(cr.CalculateArea());
		//Calling Child-Specific Method
		System.out.println(cr.CalculatePerimeter());
	}
	

}
