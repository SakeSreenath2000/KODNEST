package com.kodnest.UpCasting.Programming;

public class ParentChildApp {
	public static void main(String[] args) {
		Parent ref;
		Child ch=new Child();
		ref=ch;
		ref.display();
		
		//  (or)
		/*  Parent ref=new Child();
		    ref.display();          */
		
		
	}

}
