package com.kodnest.HibernateManyToOneMappingProject.Programming.HibernateManyToOneMapping_1;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student{
	@Id
	int Student_RollNo;
	String Student_Name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int student_RollNo, String student_Name) {
		super();
		Student_RollNo = student_RollNo;
		Student_Name = student_Name;
	}
	public int getStudent_RollNo() {
		return Student_RollNo;
	}
	public void setStudent_RollNo(int student_RollNo) {
		Student_RollNo = student_RollNo;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	@Override
	public String toString() {
		return "Student [Student_RollNo=" + Student_RollNo + ", Student_Name=" + Student_Name + "]";
	}
	
	
}
