package com.kodnest.AbstractClass.Programming;

public abstract class Program {//Program class is "Pure Abstract Class" because it contains only  "Abstract Methods"
	abstract void display1();
	abstract void display2();
	

}
/*public abstract class Program {	//Here In this Case Program class is "Impure Abstract Class" because it contains 
 									"Abstract Method" as well as "Concrete Methods"(i.e methods which have body is known
 									 as Concrete Methods)
	abstract void display1();
	void display2()
	{
		System.out.println("This is Display2 Method")
	}

}*/



/*public abstract class Program {	//Here In this Case Program class is "Impure Abstract Class" because it contains 
 									only "Concrete Methods"(i.e methods which have body is known as Concrete Methods)
	void display1()
	{
		System.out.println("This is Display1 Method")
	}
	void display2()
	{
		System.out.println("This is Display2 Method")
	}

}*/

