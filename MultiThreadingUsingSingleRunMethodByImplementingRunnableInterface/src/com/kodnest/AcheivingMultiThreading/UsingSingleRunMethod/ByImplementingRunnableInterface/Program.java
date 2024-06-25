package com.kodnest.AcheivingMultiThreading.UsingSingleRunMethod.ByImplementingRunnableInterface;

public class Program implements Runnable{
	public void run()
	{
		//Checking whether the thread name is"Number'
		if(Thread.currentThread().getName().equals("Number"))
		{
			numPrinting();//Calling numPrinting()
		}
		//Otherwise
		else {
			charPrinting();//Calling charPrinting()
		}
			
	}
	//Method For NumberPrinting
	public void numPrinting()
	{
		System.out.println("Number Printing Started");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(3000);//used to make thread to sleep for 3 seconds and later execute the statements
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
		System.out.println("Number Printing Ended");
	}
	//Method For CharacterPrinting
	public void charPrinting()
	{
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
