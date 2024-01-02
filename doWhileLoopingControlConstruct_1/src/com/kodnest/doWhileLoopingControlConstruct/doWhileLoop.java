package com.kodnest.doWhileLoopingControlConstruct;

public class doWhileLoop {
	public static void main(String[] args) {
		/*for loop will not execute because zero(0) is not less than or equals to -1 
									i.e first it checks the condition and performs the task*/
		for(int i=0;i<=-1;i++)
		{
			System.out.println("Play Game");
		}
		/*while loop will not execute because zero(0) is not less than or equals to -1 
									i.e first it checks the condition and performs the task*/
		int i=0;
		while(i<=-1)
		{
			System.out.println("Don't Play Game");
			i++;
		}
		//the above two loops is written to give the difference between them and doWhileLoop
		/*do-While loop will execute atleast once because it does't check the condition first rather first it will 
									do the task and then it will increment and finally checks the condition*/
		int m=0;
		do
		{
			System.out.println("Study Book");
			m++;
		}while(m<=-1);
	}

}
