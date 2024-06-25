package com.kodnest.BankProject.Programming;

public class Bank {
	private int money; //Providing the security to data members using "private"
	
	//public setter method
	public void setMoney(int amount)//Cashier who can take money from the bank and deposit in the bank
	{
		if(amount>0)
		{
			money=amount;
		}
		else
		{
			System.out.println("Kindly Enter Positive/Valid amount");
			System.exit(0);//i.e used to exit/stop the program
			
		}
	}
	
	//public getter method
	public int getMoney()//Cashier who can take money from the bank and give it to customer
	{
		return money;
	}

}
