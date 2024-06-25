package com.kodnest.MultiThreading_Using_JoinMethod.Programming;

public class Reel extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("Creating a Reel");
			Thread.sleep(2000);
			System.out.println("Posting a Reel");
			Thread.sleep(2000);
			System.out.println("Reel is Uploaded");
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
