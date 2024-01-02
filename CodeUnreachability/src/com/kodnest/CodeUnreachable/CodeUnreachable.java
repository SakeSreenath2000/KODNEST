package com.kodnest.CodeUnreachable;

public class CodeUnreachable {
	public static void main(String[] args) {
		for(int j=0;j<=5;j++)
		{
			break;
			System.out.print("* ");
			//break;
		}
		System.out.println();
		for(int i=0;i<=5;i++)
		{
			continue;
			System.out.print("@ ");
			//continue;
		}
	}

}
