package com.kodnest.LocalVariable_vs_InstanceVariable.Programming;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		calculator.num1=20;
		calculator.num2=10;
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
		
	}

}
