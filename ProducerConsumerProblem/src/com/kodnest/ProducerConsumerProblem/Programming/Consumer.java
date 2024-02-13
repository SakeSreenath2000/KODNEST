package com.kodnest.ProducerConsumerProblem.Programming;

public class Consumer extends Thread{
	Factory f;
	public Consumer(Factory f) {
		this.f = f;
	}
	@Override
	public void run() {
		while(true)
		{
			f.get();
		}
		
	}
}