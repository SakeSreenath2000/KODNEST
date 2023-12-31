package com.kodnest.ObjectOrientation.FanApp.Programming;

public class FanApp {
	public static void main(String[] args) {
		Fan f1=new Fan();
		Fan f2=new Fan();
		Fan f3=new Fan();
		System.out.println("=============================================");
		f1.no_of_wings=3;
		f1.cost=4500;
		f1.color="white";
		f1.brand="Crompton";
		System.out.println(f1.no_of_wings+" "+f1.cost+" "+f1.color+" "+f1.brand);
		f1.rotate();
		f1.blow_Air();
		System.out.println("=============================================");
		f2.no_of_wings=4;
		f2.cost=3000;
		f2.color="Blue";
		f2.brand="Usha";
		System.out.println(f2.no_of_wings+" "+f2.cost+" "+f2.color+" "+f2.brand);
		f2.rotate();
		f2.blow_Air();
		System.out.println("=============================================");
		f3.no_of_wings=5;
		f3.cost=9000;
		f3.color="Red";
		f3.brand="Orient";
		System.out.println(f3.no_of_wings+" "+f3.cost+" "+f3.color+" "+f3.brand);
		f3.rotate();
		f3.blow_Air();
	}

}
