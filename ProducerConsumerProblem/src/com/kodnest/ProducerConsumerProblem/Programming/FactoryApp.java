package com.kodnest.ProducerConsumerProblem.Programming;

public class FactoryApp {
	public static void main(String[] args) {
		Factory f=new Factory();
		Producer pr=new Producer(f);
		Consumer cr=new Consumer(f);
		pr.start();
		cr.start();
		
	}

}
