package com.kodnest.CodeWithInstanceofKeyword.Programming;

public class ShapeApp {
	public static void doActivity(Shape sh) {
		sh.draw();
		System.out.println(sh.findArea());
		
		if(sh instanceof Square)
		{
			System.out.println(((Square)(sh)).findSquarePerimeter());
		}
		else if(sh instanceof Circle)
		{
			System.out.println(((Circle)(sh)).findCirclePerimeter());
		}
		else
		{
			System.out.println(((Rectangle)(sh)).findRectanglePerimeter());
		}
	}
	public static void main(String []args) {
		Square sqr=new Square();
		Circle cr=new Circle();
		Rectangle rec=new Rectangle();
		doActivity(sqr);
		System.out.println("=====================");
		doActivity(cr);
		System.out.println("=====================");
		doActivity(rec);
	}

}
