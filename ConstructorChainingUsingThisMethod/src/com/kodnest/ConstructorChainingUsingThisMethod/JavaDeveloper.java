package com.kodnest.ConstructorChainingUsingThisMethod;

public class JavaDeveloper extends Developer{
	int salary=65000;
	public JavaDeveloper()
	{
		
	}
	public JavaDeveloper(int salary)
	{
		this();
		this.salary=salary;
	}

}
