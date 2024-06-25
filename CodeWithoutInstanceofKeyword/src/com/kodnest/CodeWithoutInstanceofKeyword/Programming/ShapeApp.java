package com.kodnest.CodeWithoutInstanceofKeyword.Programming;

public class ShapeApp {
	public static void main(String[] args) {
		Shape sh;
		Square sqr=new Square();
		sh=sqr;
		sh.draw();
		System.out.println(sh.findArea());
		System.out.println(((Square)(sh)).findSquarePerimeter());
		Circle cr=new Circle();
		sh=cr;
		sh.draw();
		System.out.println(sh.findArea());
		System.out.println(((Circle)(sh)).findCirclePerimeter());
		Rectangle rec=new Rectangle();
		sh=rec;
		sh.draw();
		System.out.println(sh.findArea());
		System.out.println(((Rectangle)(sh)).findRectanglePerimeter());
		
	}

}
