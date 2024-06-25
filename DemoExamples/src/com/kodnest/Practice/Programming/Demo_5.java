package com.kodnest.Practice.Programming;
//i.e Using do-while loop inside another do-while loop it is called as "Nested do-While Loop"
public class Demo_5 {
	public static void main(String[] args) {
		int m=1;
		do
		{
			int n=1;
			do
			{
				System.out.print("Kodnest ");
				n++;
			}while(n<=5);
			System.out.println();
			m++;
		}while(m<=5);
		System.out.println("Technologies ");
	}

}
