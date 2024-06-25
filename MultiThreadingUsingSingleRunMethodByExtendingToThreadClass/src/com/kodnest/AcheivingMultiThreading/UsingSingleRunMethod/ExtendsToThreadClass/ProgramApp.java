package com.kodnest.AcheivingMultiThreading.UsingSingleRunMethod.ExtendsToThreadClass;

public class ProgramApp {
	public static void main(String[] args) {
		//Creating the Thread Objects
		Program pr1=new Program();
		Program pr2=new Program();
		
		//Changing the Thread Object Name
		pr1.setName("Number");
		pr2.setName("char");
		
		//Calling the start() which calls run() internally
		pr1.start();//Starting the thread for numPrinting
		pr2.start();//Starting the thread for charPrinting
		
	}

}
