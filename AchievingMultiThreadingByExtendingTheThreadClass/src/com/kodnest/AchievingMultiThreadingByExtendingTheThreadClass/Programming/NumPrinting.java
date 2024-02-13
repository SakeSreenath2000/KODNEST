package com.kodnest.AchievingMultiThreadingByExtendingTheThreadClass.Programming;

public class NumPrinting extends Thread{
	@Override
	public void run() {
		System.out.println("Number Printing Started");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number Printing Ended");
	}

}
