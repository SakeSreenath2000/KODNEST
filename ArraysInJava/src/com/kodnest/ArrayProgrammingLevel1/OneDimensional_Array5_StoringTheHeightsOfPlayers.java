package com.kodnest.ArrayProgrammingLevel1;

import java.util.Scanner;

public class OneDimensional_Array5_StoringTheHeightsOfPlayers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float height[]=new float[10];
		for(int i=0;i<=height.length-1;i++)
		{
			System.out.println("Enter the Height of Player "+i);
			height[i]=scan.nextFloat();
		}
		System.out.println("Heights of Players are...");
		System.out.print(" | ");
		for(int i=0;i<=height.length-1;i++)
		{
			System.out.print(height[i] +" | ");
		}
		
	}

}
