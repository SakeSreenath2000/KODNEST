package com.kodnest.Practice.Programming;
//i.e Using while loop inside another while loop it is called as "Nested While Loop"
public class Demo_3 {
	public static void main(String[] args) {
		int m=1;
		while(m<=5)
		/*i.e Start from the first line(m=1) go until 5th line(m<=5) in every line print "Kodnest"
		 			5 times i.e said in "nth" while loop and bring the cursor to the next line and print Technologies*/
		{
			int n=1;
			while(n<=5)
			{
				System.out.print("Kodnest ");
				n++;
			}
			m++;
			System.out.println();
			//m++;
		}
		System.out.println("Technologies ");
	}

}
