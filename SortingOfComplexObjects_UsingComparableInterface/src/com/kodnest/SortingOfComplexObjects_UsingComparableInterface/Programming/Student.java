package com.kodnest.SortingOfComplexObjects_UsingComparableInterface.Programming;

public class Student implements Comparable{
	int rollNo;
	String Name;
	float Percentage;
	public Student(int rollNo, String Name, float Percentage) {
		this.rollNo = rollNo;
		this.Name = Name;
		this.Percentage = Percentage;
	}
	@Override
	public int compareTo(Object o) {
		if(this.rollNo < ((Student)(o)).rollNo){
			return -1;
		}
		else if(this.rollNo > ((Student)(o)).rollNo) {
			return 1;
		}
		else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", Percentage=" + Percentage + "]";
	}
	
}

								//(or)
/*As written above "Student" class we can also write without using DownCasting to access child specific methods (or)
  child specific data members(rollNo,Name,Percentage) as we know every class has "Object" class as Default Parent class.
  So we can mention <Student> as Generic directly while implementing the comparable interface.The below is modified 
  version of Student class*/
/*public class Student implements Comparable<Student>{
	int rollNo;
	String Name;
	float Percentage;
	public Student(int rollNo, String Name, float Percentage) {
		this.rollNo = rollNo;
		this.Name = Name;
		this.Percentage = Percentage;
	}
	@Override
	public int compareTo(Student o) {
		if(this.rollNo < o.rollNo){
			return -1;
		}
		else if(this.rollNo > o.rollNo) {
			return 1;
		}
		else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", Percentage=" + Percentage + "]";
	}
	
}
 */
