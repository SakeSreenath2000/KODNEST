package com.kodnest.MultiThreading_Using_JoinMethod.Programming;

public class InstagramApp {
	public static void main(String[] args) {
		try {
			System.out.println("Instagram App is Opened");
			Chatting ch=new Chatting();
			Reel rl=new Reel();
			ch.start();
			rl.start();
			ch.join();
			rl.join();
			System.out.println("Instagram App is Closed");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
