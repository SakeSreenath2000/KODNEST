package com.kodnest.SynchronizedKeyword_Project.Programming;

public class KodNestLibraryApp {
	public static void main(String[] args) {
		KodNestLibrary kl=new KodNestLibrary();
		Thread t1=new Thread(kl);
		Thread t2=new Thread(kl);
		t1.setName("Tom"); //Assume Tom and Jerry are Students
		t2.setName("Jerry");
		t1.start();
		t2.start();
		
	}

}
