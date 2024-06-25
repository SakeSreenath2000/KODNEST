package com.kodnest.Methods.Programming;

public class Debugging {
	public static void main(String[] args) {
		System.out.println("Debugging starts...");
		add();
		int a=20,b=10;
		int res=sub(a,b);
		System.out.println("Subtraction result is "+res);
	}
	public static void add() {
		int a=10,b=20,c=a+b;
		System.out.println("Addition result is "+c);
	}
	public static int sub(int a,int b) {
		return a-b;
	}
}

