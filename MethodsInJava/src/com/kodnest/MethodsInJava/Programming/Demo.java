package com.kodnest.MethodsInJava.Programming;

public class Demo {
	public static void main(String[] args) {
		greet();//Method call
		int x=20;
		int	y=10;
		int res=add(x,y);
		System.out.println("Addition is "+res);
		int res1=multi(x,y);
		System.out.println("Multiplication is "+res1);
		boolean res2=checkGreater(x,y);
		System.out.println(res2);
		int res3=add(x,y)/2;
		System.out.println("Average is "+res3);
	}
	public static void greet(){
		System.out.println("Hello World!");
	}
	public static int add(int x,int y) {
		return x+y;
	}
	public static void sub() {
		int a=20;
		int b=10;
		System.out.println("Subtraction is "+(a-b));
	}
	public static int div(int m,int n) {
		return m/n;
	}
	public static int mod(int a,int b) {
		return a%b;
	}
	public static int multi(int x,int y) {
		return x*y;
	}
	public static boolean checkGreater(int x,int y) {
		return x>y;
	}
}

