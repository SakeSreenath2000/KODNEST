package com.kodnest.CustomExceptionScenario1.Programming;

import java.util.Scanner;

public class TransferAmountApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn");
		int amount=scan.nextInt();
		try {
			//Calling the transfer() which throws Custom Exception
			transfer(amount);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void transfer(int amount) throws Exception {
		if(amount<10000) {
			//creating object of Custom Exception and ReThrowing it to Caller Method 
			System.out.println("Amount is Given");
		}
		else {
			throw new InsufficientBalanceException();
		}
	}

}
