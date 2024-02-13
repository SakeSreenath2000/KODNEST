package com.kodnest.Achieving_Encapsulation_Using_Constructor;

public class LaptopApp {
	public static void main(String[] args) {
		Laptop l1=new Laptop("Core i5",512);
		System.out.println(l1.getProcessorName());
		System.out.println(l1.getMemorySize());
		Laptop l2=new Laptop("Core i7",512);
		System.out.println(l2.getProcessorName());
		System.out.println(l2.getMemorySize());
	}

}
