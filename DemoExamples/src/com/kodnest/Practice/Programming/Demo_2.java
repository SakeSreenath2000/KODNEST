package com.kodnest.Practice.Programming;
// i.e Using for loop inside another for loop it is called as "Nested For Loop"
public class Demo_2 {
	public static void main(String[] args) {
		for(int j=1;j<=5;j++)/*i.e Start from the first line(j=1) go until 5th line(j<=5) in every line print "Kodnest"
		 			5 times i.e said in "ith" for loop and bring the cursor to the next line and print Technologies*/
		{
			for(int i=1;i<=5;i++)
			{
				System.out.print("Kodnest ");
			}
			System.out.println();
		}
		System.out.println("Technologies ");
	}

}
