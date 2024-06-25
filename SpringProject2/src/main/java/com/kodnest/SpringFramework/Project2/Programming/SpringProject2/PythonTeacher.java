package com.kodnest.SpringFramework.Project2.Programming.SpringProject2;

public class PythonTeacher {
	int PT_Id;
	String PT_Name;
	public PythonTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PythonTeacher(int pT_Id, String pT_Name) {
		super();
		PT_Id = pT_Id;
		PT_Name = pT_Name;
	}
	public int getPT_Id() {
		return PT_Id;
	}
	public void setPT_Id(int pT_Id) {
		PT_Id = pT_Id;
	}
	public String getPT_Name() {
		return PT_Name;
	}
	public void setPT_Name(String pT_Name) {
		PT_Name = pT_Name;
	}
	@Override
	public String toString() {
		return "PythonTeacher [PT_Id=" + PT_Id + ", PT_Name=" + PT_Name + "]";
	}
	
}
