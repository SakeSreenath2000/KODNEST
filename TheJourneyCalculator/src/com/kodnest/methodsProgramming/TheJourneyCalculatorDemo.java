package com.kodnest.methodsProgramming;

import java.util.Scanner;

public class TheJourneyCalculatorDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the speed and time");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		double result=journeyCalculator.calculateDistance(60.0, 1.5);
		System.out.println(result);
	}

}
