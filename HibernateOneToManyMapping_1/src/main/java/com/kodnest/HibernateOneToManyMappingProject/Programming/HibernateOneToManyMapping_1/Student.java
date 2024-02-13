package com.kodnest.HibernateOneToManyMappingProject.Programming.HibernateOneToManyMapping_1;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	int Student_RollNo;
	String Student_Name;
	@OneToMany
	List<Laptop> lap;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int student_RollNo, String student_Name, List<Laptop> lap) {
		super();
		Student_RollNo = student_RollNo;
		Student_Name = student_Name;
		this.lap = lap;
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
	public List<Laptop> getLap() {
		return lap;
	}
	public void setLap(List<Laptop> lap) {
		this.lap = lap;
	}
	@Override
	public String toString() {
		return "Student [Student_RollNo=" + Student_RollNo + ", Student_Name=" + Student_Name + ", lap=" + lap + "]";
	}
	
	
}
