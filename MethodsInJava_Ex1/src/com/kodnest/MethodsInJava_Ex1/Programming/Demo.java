package com.kodnest.MethodsInJava_Ex1.Programming;

public class Demo {
	public static void main(String[] args) {
		add();
		int a=20;
		int b=10;
		int res=sub(a,b);
		System.out.println(res);
		
	}

	public static int sub(int x,int y) {
		return x-y;
	}
	public static void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}

}
