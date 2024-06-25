package com.kodnest.WithoutUsingDaemonThread.Programming;

public class Saving extends Thread{
	@Override
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Saving the Code");
				Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
