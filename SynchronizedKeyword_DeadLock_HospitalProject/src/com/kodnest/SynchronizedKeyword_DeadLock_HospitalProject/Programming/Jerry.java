package com.kodnest.SynchronizedKeyword_DeadLock_HospitalProject.Programming;

public class Jerry implements Runnable{
	Hospital h; //Creating Hospital type Reference
	
	public Jerry(Hospital h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.jerrytreatment();
	}

}
