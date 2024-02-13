package com.kodnest.SynchronizedKeyword_HospitalProject.Programming;

public class Tom implements Runnable{
	Hospital h; //Creating Hospital type Reference
	
	public Tom(Hospital h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.tomtreatment();
	}

}
