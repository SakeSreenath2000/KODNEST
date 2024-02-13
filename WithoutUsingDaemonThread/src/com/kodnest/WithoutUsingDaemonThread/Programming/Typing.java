package com.kodnest.WithoutUsingDaemonThread.Programming;

public class Typing extends Thread{
	@Override
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Typing the Code");
				Thread.sleep(3000);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
