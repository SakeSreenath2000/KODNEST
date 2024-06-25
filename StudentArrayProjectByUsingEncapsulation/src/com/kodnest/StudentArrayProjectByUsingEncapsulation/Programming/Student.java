package com.kodnest.StudentArrayProjectByUsingEncapsulation.Programming;

public class Student {
	//private Data Members
	private int rollNo;
	private String Name;
	private int age;
	
	//public setter method
	public void setData(int x,String y,int z)
	{
		rollNo=x;
		Name=y;
		age=z;
	}
	
	//public getter method
	public int getRollNo()
	{
		return rollNo;
	}
	public String getName()
	{
		return Name;
	}
	public int getAge() 
	{
		return age;
	}

}
