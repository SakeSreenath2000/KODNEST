package com.kodnest.LimitationsUpCasting.Programming;

public class DeveloperApp {
	public static void main(String[] args) {
		Developer dev;
		BackEndDeveloper bed= new BackEndDeveloper();
		dev=bed;
		dev.AttendMeeting();
		dev.project();
		dev.learnJava();//Error will come because child specific methods cannot be called using parent type reference
		DataBaseDeveloper dbd=new DataBaseDeveloper();
		dev=dbd;
		dev.AttendMeeting();
		dev.project();
		dev.learnSQL();//Error will come because child specific methods cannot be called using parent type reference
		WebDeveloper wd=new WebDeveloper();
		dev=wd;
		dev.AttendMeeting();
		dev.project();
		dev.learnHTML();//Error will come because child specific methods cannot be called using parent type reference
		
	}

}
