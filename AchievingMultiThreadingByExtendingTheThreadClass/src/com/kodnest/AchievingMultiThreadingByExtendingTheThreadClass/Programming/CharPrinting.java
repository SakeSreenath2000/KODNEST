package com.kodnest.AchievingMultiThreadingByExtendingTheThreadClass.Programming;

public class CharPrinting extends Thread{
	@Override
	public void run() {
		System.out.println("Character Printing Started");
		for(char i='A';i<='E';i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Character Printing Ended");
	}

}
