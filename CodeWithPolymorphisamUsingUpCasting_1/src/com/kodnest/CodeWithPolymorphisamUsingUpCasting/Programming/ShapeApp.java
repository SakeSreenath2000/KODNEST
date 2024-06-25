package com.kodnest.CodeWithPolymorphisamUsingUpCasting.Programming;

public class ShapeApp {
	public static void main(String[] args) {
		Shape sh;
		Square sqr=new Square();
		sh=sqr;//Up Casting
		sh.draw();
		System.out.println(sh.findArea());
		Rectangle rec=new Rectangle();
		sh=rec;//Up Casting
		sh.draw();
		System.out.println(sh.findArea());
		Circle cr=new Circle();
		sh=cr;//Up Casting
		sh.draw();
		System.out.println(sh.findArea());
		
		
	}
	

}
