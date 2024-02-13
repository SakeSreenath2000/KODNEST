package com.kodnest.SynchronizedKeyword_DeadLock_HospitalProject.Programming;

public class HospitalApp {
	public static void main(String[] args) {
		Hospital h=new Hospital();
		Tom t=new Tom(h);
		Jerry j=new Jerry(h);
		Thread t1=new Thread(t);
		Thread t2=new Thread(j);
		t1.start(); /*The program will not be ended(terminated) because Tom&Jerry (t1&t2) threads will 
											go into Blocked State & Never comes out i.e Known as "DeadLock"*/
		t2.start();/*DeadLock will not have a solution , it has only precaution that is 
											the precaution is to write the code in a correct way*/
		
	}

}
