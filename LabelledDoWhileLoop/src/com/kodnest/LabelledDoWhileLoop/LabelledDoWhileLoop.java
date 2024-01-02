package com.kodnest.LabelledDoWhileLoop;

public class LabelledDoWhileLoop {
	public static void main(String[] args) {
		int i=1;
		Ram:do
		{
			int j=1;
			/*Charan:do i.e here "Charan" is marked an yellow line below it referring that it is unused 
				so we can remove it there is no need of writing it in this situation*/
			do 
			{
				System.out.print("* ");
				j++;
				if(j==2)
				{
					break Ram;
				}
				
			}while(j<=5);
			System.out.print("@ ");
			i++;
			
		}while(i<=5);
	}

}
