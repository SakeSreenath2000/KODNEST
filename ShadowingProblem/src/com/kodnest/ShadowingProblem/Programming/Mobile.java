package com.kodnest.ShadowingProblem.Programming;

public class Mobile {
	String brand ;
	String color;
	int cost;
	public Mobile(String brand,String color,int cost) {
		//Shadowing Problem
		//brand=brand; i.e The assignment to variable brand has no effect
		//color=color; i.e The assignment to variable color has no effect
		//cost=cost;   i.e The assignment to variable cost has no effect
		//To solve Shadowing Problem we use "this" keyword which hold address of current object.
		this.brand=brand;
		this.color=color;
		this.cost=cost;
	
	}
	void allowToCall(){
		System.out.println("TRING TRING...Calling...");
	}
	void allowToPlay(){
		System.out.println("Start Playing BGMI....");
	}
	
}
	