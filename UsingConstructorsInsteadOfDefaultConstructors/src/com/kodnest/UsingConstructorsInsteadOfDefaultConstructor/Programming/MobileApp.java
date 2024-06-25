package com.kodnest.UsingConstructorsInsteadOfDefaultConstructor.Programming;

public class MobileApp {
	public static void main(String[] args) {
		Mobile mobile=new Mobile("Samsung", "Purple", 125000);
		System.out.println(mobile.brand+" "+mobile.color+" "+mobile.cost);
		mobile.allowToCall();
		mobile.allowToPlay();
		Mobile mobile2=new Mobile();/*This Line gives an Error because compiler did not add default constructor , due to
		to user has already defined one constructor is present in the class*/
	}
}
