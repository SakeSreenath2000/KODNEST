package com.kodnest.AchievingMultiThreadingByImplementingTheRunnableInterface.Programming;

public class NumPrinting implements Runnable{
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
