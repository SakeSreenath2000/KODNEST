package com.kodnest.SortingOfComplexObjects_UsingComparableInterface.Programming;

/*As written in "Student" class we can also write without using DownCasting to access child specific methods (or)
child specific data members(rollNo,Name,Percentage) as we know every class has "Object" class as Default Parent class.
So we can mention <Student>(here we used class name as StudentWithoutUsingDownCasting so the Generic will be changed to
<StudentWithoutUsingDownCasting>) as Generic directly while implementing the comparable interface.The below is modified 
version of Student(here we used class name as StudentWithoutUsingDownCasting i.e so Constructor and both overridden 
methods will be changed to present class name) class*/

public class StudentWithoutUsingDownCasting implements Comparable<StudentWithoutUsingDownCasting>{
	int rollNo;
	String Name;
	float Percentage;
	public StudentWithoutUsingDownCasting(int rollNo, String Name, float Percentage) {
		this.rollNo = rollNo;
		this.Name = Name;
		this.Percentage = Percentage;
	}
	@Override
	public int compareTo(StudentWithoutUsingDownCasting o) {
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
		return "StudentWithoutUsingDownCasting [rollNo=" + rollNo + ", Name=" + Name + ", Percentage=" + Percentage + "]";
	}
	

}
