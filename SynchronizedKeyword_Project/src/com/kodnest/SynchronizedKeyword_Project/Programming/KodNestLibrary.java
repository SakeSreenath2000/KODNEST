package com.kodnest.SynchronizedKeyword_Project.Programming;

public class KodNestLibrary implements Runnable{

	@Override
	synchronized public void run()//synchronized keyword is used to put a lock on the shared resources in MultiThreading 
	{
		try {
			System.out.println(Thread.currentThread().getName() +" is taking the KodNest Book");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() +" is reading the KodNest Book");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() +" is returning the KodNest Book");
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
