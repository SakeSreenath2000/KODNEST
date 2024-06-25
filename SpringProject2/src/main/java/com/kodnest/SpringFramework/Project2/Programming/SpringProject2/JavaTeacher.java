package com.kodnest.SpringFramework.Project2.Programming.SpringProject2;

public class JavaTeacher {
	int JT_Id;
	String JT_Name;
	public JavaTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JavaTeacher(int jT_Id, String jT_Name) {
		super();
		JT_Id = jT_Id;
		JT_Name = jT_Name;
	}
	public int getJT_Id() {
		return JT_Id;
	}
	public void setJT_Id(int jT_Id) {
		JT_Id = jT_Id;
	}
	public String getJT_Name() {
		return JT_Name;
	}
	public void setJT_Name(String jT_Name) {
		JT_Name = jT_Name;
	}
	@Override
	public String toString() {
		return "JavaTeacher [JT_Id=" + JT_Id + ", JT_Name=" + JT_Name + "]";
	}

}
