package com.kodnest.ProducerConsumerProblem.Programming;

public class Factory {
	int x;
	public void put(int a) {
		x=a;
		System.out.println("The value stored in x is :"+x);
	}
	public void get() {
		System.out.println("The value of x is :"+x);
	}

}
