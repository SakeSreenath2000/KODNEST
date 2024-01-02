package com.kodnest.Calculator.programming;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		while(true)
		{
			System.out.println("+ for add");
			System.out.println("- for sub");
			System.out.println("* for mul");
			System.out.println("/ for div");
			char choice=scan.next().charAt(0);//i.e Reading a character
			//int choice=scan.nextInt();
			Calculator calci=new Calculator();
			switch(choice)
			{
			case '+':	int add=calci.add(num1, num2);
			System.out.println(add);
			break;
			case '-':	int sub=calci.sub(num1, num2);
			System.out.println(sub);
			break;
			case '*':	int mul=calci.mul(num1, num2);
			System.out.println(mul);
			break;
			case '/':	Calculator theCalculator=new Calculator(num1,num2);
			break;
			/*case 1:	int add=calci.add(num1, num2);
						System.out.println(add);
						break;
			case 2:	int sub=calci.sub(num1, num2);
						System.out.println(sub);
						break;
			case 3:	int mul=calci.mul(num1, num2);
						System.out.println(mul);
						break;
			case 4:	Calculator theCalculator=new Calculator(num1,num2);
						break;*/
			default:return;
			}
			
		}
	}

}
