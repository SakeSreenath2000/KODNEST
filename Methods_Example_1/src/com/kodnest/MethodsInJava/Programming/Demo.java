package com.kodnest.MethodsInJava.Programming;

public class Demo {
	public static void main(String[] args) {
		greet();//Method Call
		Add();//Method Call
	}

	public static void Add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition result is "+c);
	}

	public static void greet() {
		System.out.println("Hello World...");
	}
}
