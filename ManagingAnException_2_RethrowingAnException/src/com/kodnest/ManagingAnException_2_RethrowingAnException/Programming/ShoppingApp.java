package com.kodnest.ManagingAnException_2_RethrowingAnException.Programming;

import java.util.Scanner;

public class ShoppingApp {
	public static void main(String[] args) {
		shop();
	}

	public static void shop() {
		System.out.println("Shopping is started");
		try {
			pay(); // This method is ReThrowing the Exception so wee keep it in try and catch blocks 
		}
		catch(Exception e){
			System.out.println("Exception is handled in shop method");
		}
		finally {
			System.out.println("Shopping is completed");
		}
	}

	public static void pay() throws Exception //"throws" providing warning to the Caller Method
	{
		try {
			System.out.println("Payment is started");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter amount to be paid");
			int amount=scan.nextInt();
			
		}
		catch(Exception e){
			System.out.println("Exception is handled in pay method");
			throw e;//ReThrows the Exception to its Caller Method
		}
		finally {
			System.out.println("Payment is completed");
		}
	}

}
