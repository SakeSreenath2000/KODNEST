package com.kodnest.AcheivingMultiThreading.UsingSingleRunMethod.ByImplementingRunnableInterface;

public class ProgramApp {
	public static void main(String[] args) {
		//Creating the Object of Program class 
		Program pr1=new Program();
		
		//Creating the Thread Objects By Passing Reference of "Program Class" Object
		Thread t1=new Thread(pr1);
		Thread t2=new Thread(pr1);
		
		//Changing the Thread Object Name
		t1.setName("Number");
		t2.setName("char");
		
		//Calling the start() which calls run() internally
		t1.start();//Starting the thread for numPrinting
		t2.start();//Starting the thread for charPrinting		

	}

}
