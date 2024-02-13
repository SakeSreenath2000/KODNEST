package com.kodnest.Inheritance_RobotApplication.Programming;

//This project is an example of Hierarchical Inheritance
public class RobotApplication {
	public static void main(String[] args) {
		Robot res=new Robot();
		res.talk();
		res.walk();
		res.charge();
		ChefRobot CR=new ChefRobot();
		CR.talk();
		CR.walk();
		CR.charge();
		CR.cook();
		DoctorRobot DR=new DoctorRobot();
		DR.talk();
		DR.walk();
		DR.charge();
		DR.sugery();
		TeacherRobot TR=new TeacherRobot();
		TR.talk();
		TR.walk();
		TR.charge();
		TR.teach();
	}

}
