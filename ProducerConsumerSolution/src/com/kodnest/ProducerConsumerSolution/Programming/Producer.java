package com.kodnest.ProducerConsumerSolution.Programming;

public class Producer extends Thread{
	Factory f;
	public Producer(Factory f) {
		this.f = f;
	}
	@Override
	public void run() {
		int i=1;
		while(true)
		{
			f.put(i+=1);
		}

	}
	
}
