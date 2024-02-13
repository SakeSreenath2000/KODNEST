package com.kodnest.CustomExceptionsScenario2.Programming;

import java.util.Scanner;

public class DrivingLicenseApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age of the person");
		int age=scan.nextInt();
		try {
			ageCalculator(age);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
	public static void ageCalculator(int age) throws Exception
	{
		if(age<18) {
			//creating object of custom exception and throwing it to caller method
			throw new underAgeException();
		}
		else if(age>65) {
			//creating object of custom exception and throwing it to caller method
			throw new overAgeException();
		}
		else {
			System.out.println("Driving License is Given");
		}
	}

}
