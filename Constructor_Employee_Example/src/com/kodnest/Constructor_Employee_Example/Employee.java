package com.kodnest.Constructor_Employee_Example;

public class Employee {
	private int empId;
	private String Name;
	private float salary;
	public Employee(int empId,String Name,float salary)
	{
		this.empId=empId;
		this.Name=Name;
		this.salary=salary;
	}
	public int getEmpId()
	{
		return empId;
	}
	public String getName()
	{
		return Name;
	}
	public float getSalary()
	{
		return salary;
	}
	

}
