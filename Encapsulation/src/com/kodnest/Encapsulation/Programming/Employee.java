package com.kodnest.Encapsulation.Programming;

/*Encapsulation is used to achieve the "Code Security" in the java program.A class containing Data Members and 
 	Member Functions is the example of Encapsulation.Because Encapsulation is the process of binding the Data Members
      and Member Functions in a Single Entity that is a "Class" */

public class Employee {
	//DataMembers
	int empId;
	String empName;
	float empSalary;
	//MemberFunctions
	void work() {
		System.out.println("Employee is working");
	}
	void attendMeeting() {
		System.out.println("Employee is attending meeting");
	}

}
