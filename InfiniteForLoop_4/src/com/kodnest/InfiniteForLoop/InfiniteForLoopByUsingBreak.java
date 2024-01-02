package com.kodnest.InfiniteForLoop;

public class InfiniteForLoopByUsingBreak {
	public static void main(String[] args) {
		int i=10;
		for(;;)
		{
			i++;
			if(i==15)
			{
				break;
			}
			System.out.println("Kodnest");
			
		}
	}

}
