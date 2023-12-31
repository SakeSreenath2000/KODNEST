package com.kodnest.LocalVariable_vs_InstanceVariable.Programming;

public class Calculator {
	//Instance Variables (or) Data Members num1 and num2
	int num1;
	int num2;
	void add() {
		//Local Variable res1
		int res1;
		res1=num1+num2;
		System.out.println("Addition result is "+res1);
	}
	void sub() {
		//Local Variable res2
		int res2=num1-num2;
		System.out.println("Subtraction result is "+res2);
	}
	void mul() {
		//Local Variable res3
		int res3=num1*num2;
		System.out.println("Multiplication result is "+res3);
	}
	void div() {
		//Local Variable res4
		int res4=num1/num2;
		System.out.println("Division result is "+res4);
	}

}
