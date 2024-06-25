package com.kodnest.Methods.Programming;

public class MethodClass {
	public static void main(String[] args) {
		Greet();//Method call
		int a=20,b=10;
		int res1=add(a,b);
		System.out.println("Addition is "+res1);
		int res2=div(b,a);
		System.out.println("Division is "+b);
		int res3=mod(b,a);
		System.out.println("mod is "+res3);
		int res4=mul(a,b);
		System.out.println("mul is "+res4);
		boolean res5=checkGreater(a,b);
		System.out.println("true or false result is "+res5);
	}
	public static void Greet(){
		System.out.println("Hello World!");
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static void sub() {
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println("Subtraction is "+c);
	}
	public static int div(int a,int b) {
		return b/a;
	}
	public static int mod(int a,int b) {
		return b%a;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static boolean checkGreater(int a,int b) {
		return a>b;
	}
}
