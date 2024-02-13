package com.kodnest.Constructor_Employee_Example;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Ajay",45000.5F);
		System.out.println(e1.getEmpId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		Employee e2=new Employee(2,"Nikhil",55000.7f);
		System.out.println(e2.getEmpId());
		System.out.println(e2.getName());
		System.out.println(e2.getSalary());
		
		
	}

}
