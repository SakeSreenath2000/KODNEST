package com.kodnest.WithUsingDaemonThread.Programming;

public class Saving extends Thread{
	@Override
	public void run() {
		try {
			for(;;) //Following Step:-1 The Daemon Thread activity should be placed in the "Infinite loop"
			{
				System.out.println("Saving the Code");
				Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

