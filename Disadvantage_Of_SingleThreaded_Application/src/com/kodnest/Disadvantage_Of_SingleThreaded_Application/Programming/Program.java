package com.kodnest.Disadvantage_Of_SingleThreaded_Application.Programming;

public class Program {
	public static void main(String[] args) {
		PrintNum();
		PrintChar();
	}

	public static void PrintNum() {
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
	public static void PrintChar() {
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
