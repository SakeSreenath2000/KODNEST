package com.kodnest.Multi_Threading_Calculator.Programming;

public class App {
	public static void main(String[] args) {
		ADD res1=new ADD();
		Sub res2=new Sub();
		Mul res3=new Mul();
		Div res4=new Div();
		Mod res5=new Mod();
		Thread t1=new Thread(res1);
		Thread t2=new Thread(res2);
		Thread t3=new Thread(res3);
		Thread t4=new Thread(res4);
		Thread t5=new Thread(res5);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
