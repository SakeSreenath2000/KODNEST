package com.kodnest.LabelledWhileLoop.Programming;

public class LabelledWhileLoop {
	public static void main(String[] args) {
		int i=1;
		Ram:while(i<=5)
		{
			int j=1;
			/*Charan:while(j<=5) i.e here "Charan" is marked an yellow line below it referring that it is unused 
			 									so we can remove it there is no need of writing it in this situation*/
			while(j<=5)												
			{
				System.out.println("* ");
				j++;
				break Ram;
			}
			i++;
			System.out.println();
		}
	}

}
