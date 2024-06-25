package com.kodnest.Invoking_ChildSpecificMethods_UsingInterfaceTypeReference_UsingDownCasting.Programming;

public class DeveloperApp {
	public static void main(String[] args) {
		FrontEndTech fet=new Developer();//UpCasting i.e means assigning child to parent type reference
		fet.learnHTML();//invoking the overridden method of child class
		((Developer)(fet)).learnJava();//calling child specific method by doing "DownCasting" i.e means assigning parent type reference to child 
	}

}
