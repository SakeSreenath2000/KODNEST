package com.kodnest.Multi_Threading_Calculator.Programming;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator ca=new Calculator();
		Thread t1=new Thread(ca);
		Thread t2=new Thread(ca);
		Thread t3=new Thread(ca);
		Thread t4=new Thread(ca);
		Thread t5=new Thread(ca);
		t1.setName("add");
		t2.setName("sub");
		t3.setName("mul");
		t4.setName("div");
		t5.setName("mod");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
