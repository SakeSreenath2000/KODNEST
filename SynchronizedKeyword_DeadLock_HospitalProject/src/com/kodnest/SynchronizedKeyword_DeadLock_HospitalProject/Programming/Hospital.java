package com.kodnest.SynchronizedKeyword_DeadLock_HospitalProject.Programming;

public class Hospital {
	String resource1="Doctor";
	String resource2="Bed";
	void tomtreatment()
	{
		try 
		{
			synchronized(resource1) 
			{
				System.out.println("Tom is using "+resource1);
				Thread.sleep(3000);
				synchronized(resource2) 
				{
					System.out.println("Tom is using "+resource2);
					Thread.sleep(3000);
					
				}
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	void jerrytreatment()
	{
		try 
		{
			synchronized(resource2) 
			{
				System.out.println("Jerry is using "+resource2);
				Thread.sleep(3000);
				synchronized(resource1) 
				{
					System.out.println("Jerry is using "+resource1);
					Thread.sleep(3000);
					
				}
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	

}
