package com.kodnest.LoopingControlConstruct;

public class AllThreeLoops {
	public static void main(String[] args) {
		System.out.println("===================================");
		//The For Loop i.e going behind
		for(int i=10;i>=6;i--)
		{
			System.out.println("Kodnest");
		}
		System.out.println("===================================");
		//The While Loop i.e going behind
		int i=15;
		while(i>=11)
		{
			System.out.println("Amma");
			i--;
		}
		System.out.println("===================================");
		//The do-While Loop i.e going behind
		int i1=20;
		do
		{
			System.out.println("Sreenath");
			i1--;
		}while(i1>=16);
		System.out.println("===================================");
		//The For Loop i.e going ahead
		for(int m=6;m<=10;m++)
		{
			System.out.println("Kodnest");
		}
		System.out.println("===================================");
		//The While Loop i.e going ahead
		int m=7;
		while(m<=11)
		{
			System.out.println("Amma");
			m++;
		}
		System.out.println("===================================");
		//The do-While Loop i.e going ahead
		int m1=6;
		do
		{
			System.out.println("Sreenath");
			m1++;
		}while(m1<=10);
		System.out.println("===================================");
				
	}

}
