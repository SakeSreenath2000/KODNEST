package com.kodnest.ControlConstruct.If_elseConditionalControlConstruct;

import java.util.Scanner;

public class If_Else {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=scan.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			System.out.println("You are Not eligible for voting");
		}
		
	}
	

}
