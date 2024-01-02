package com.kodnest.ElseifLadderProgram;

import java.util.Scanner;

public class ElseifLadderConditionalControlConstruct {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Score");
		int score=scan.nextInt();
		Grade G1=new Grade();
		G1.giveGrade(score);
	
	}

}
