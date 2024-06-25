package com.kodnest.CodeWithPolymorphisamUsingUpCastingWithoutRedundancy.Programming;

public class ShapeApp {
	public static void main(String[] args) {
		Square sqr=new Square();
		Rectangle rec=new Rectangle();
		Circle cr=new Circle();
		Geometry gr=new Geometry();/*creating another class of "Geometry" and creating the object to eliminate code 
										redundancy and passing "Parent type Reference" as a parameter*/
		gr.activity(sqr);
		gr.activity(rec);
		gr.activity(cr);
		
		
	}

}
