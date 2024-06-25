package com.kodnest.MethodsProgramsBasedOnScenario.Programming;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Name and Year of Birth");
		String name=scan.nextLine();
		int YOB=scan.nextInt();
		greet(name);
		int res=calculateAge(YOB);
		System.out.println("You are "+res+" years old");
		
	}
	public static void greet(String name) {
		System.out.println("Hello "+name);
	}
	public static int calculateAge(int YOB) {
		return 2023-YOB;
	}

}
