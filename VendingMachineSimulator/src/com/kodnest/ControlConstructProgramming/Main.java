package com.kodnest.ControlConstructProgramming;

import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode){
		switch(productCode)
		{
		case "P01":
			System.out.println("Coco Cola");
			break;
		case "P02":
			System.out.println("Pepsi");
			break;
		case "P03":
			System.out.println("Fanta");
			break;
		case "P04":
			System.out.println("JalJeera");
			break;
		case "P05":
			System.out.println("MountainDew");
			break;
		case "P06":
			System.out.println("BoatGuava");
			break;
		default:
			System.out.println("Panaka");
		
		}

	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String productCode=scan.next();
		getProduct(productCode);
		
	}

}
