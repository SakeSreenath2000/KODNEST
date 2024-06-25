package com.kodnest.SpringFramework.Project2.Programming.SpringProject2;

public class SQLTeacher {
	int ST_Id;
	String ST_Name;
	public SQLTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SQLTeacher(int sT_Id, String sT_Name) {
		super();
		ST_Id = sT_Id;
		ST_Name = sT_Name;
	}
	public int getST_Id() {
		return ST_Id;
	}
	public void setST_Id(int sT_Id) {
		ST_Id = sT_Id;
	}
	public String getST_Name() {
		return ST_Name;
	}
	public void setST_Name(String sT_Name) {
		ST_Name = sT_Name;
	}
	@Override
	public String toString() {
		return "SQLTeacher [ST_Id=" + ST_Id + ", ST_Name=" + ST_Name + "]";
	}
	
}
