package com.kodnest.ObjectOrientationPillars.Abstraction.Programming;

public class DeveloperApp {
	public static void doActivity(Developer dev)
	{
		dev.attendMeeting();
		dev.doProject();
		if(dev instanceof JavaDeveloper)//instance means object and instanceof is a keyword
		{
			((JavaDeveloper)(dev)).learnJava();//Down Casting
		}
		else
		{
			((PythonDeveloper)(dev)).learnPython();//Down Casting
		}
	}
	public static void main(String[] args) {
		JavaDeveloper jd=new JavaDeveloper();
		PythonDeveloper pd=new PythonDeveloper();
		doActivity(jd);
		doActivity(pd);
	}

}
