package om.kodnest.FinalKeywordInJava.FinalClass;

public class Child extends Parent {//Error , because final classes cannot be inherited
	void display()
	{
		System.out.println("This is a Child class Method");
	}

}
