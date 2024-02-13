package com.kodnest.Inheritance_ParentApp.Programming;

//This project is an example of Single Inheritance 
public class ParentApp {
	public static void main(String[] args) {
		Parent P=new Parent();
		P.foodBussiness();
		System.out.println(P.eyeColor);
		
		System.out.println("========================");
		
		Child C=new Child();
		C.foodBussiness();
		System.out.println(C.eyeColor);
		
	}

}
