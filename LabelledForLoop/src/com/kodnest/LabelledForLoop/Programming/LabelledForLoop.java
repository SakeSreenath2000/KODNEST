package com.kodnest.LabelledForLoop.Programming;

public class LabelledForLoop {
	public static void main(String[] args) {
		System.out.println("Robo....");
		rajini:for(int i=1;i<=5;i++)
		{
			tamanna:for(int j=1;j<=5;j++)
			{
				System.out.print("* ") ; 
				break rajini;
			}
			System.out.println();
		}
	}

}
