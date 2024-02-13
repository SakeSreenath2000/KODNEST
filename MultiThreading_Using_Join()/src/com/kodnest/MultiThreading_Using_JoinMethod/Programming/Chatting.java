package com.kodnest.MultiThreading_Using_JoinMethod.Programming;

public class Chatting extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("Chatting Started");
			Thread.sleep(2000);
			System.out.println("Chatting Happening");
			Thread.sleep(2000);
			System.out.println("Chatting Ended");
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
