package com.kodnest.BankProject.Programming;

public class BankApp {
	public static void main(String[] args) {
		Bank b=new Bank();
		/*	b.money=5000;
			Above is "DIRECTLY accessing the private Data Members"
			It will give Error
			System.out.println("Taking the money " +b.money);
			It will also gives an Error
			So , Now we access "Indirectly Accessing the private Data Members using "public setters and public getters"
		*/
		b.setMoney(5000);
		System.out.println("Taking the money "+b.getMoney());
	}

}
