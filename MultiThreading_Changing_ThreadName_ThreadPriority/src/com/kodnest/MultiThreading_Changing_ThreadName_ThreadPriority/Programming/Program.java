package com.kodnest.MultiThreading_Changing_ThreadName_ThreadPriority.Programming;

public class Program {
	public static void main(String[] args) {
		//Accessing the currently executing Thread Object
		Thread t=Thread.currentThread();
		//Printing Thread Name,Thread Priority and Thread Group Name
		System.out.println(t);
		//Changing Thread Name
		t.setName("My Thread");
		//Changing Thread Priority
		t.setPriority(9);
		//Printing Thread Name,Thread Priority and Thread Group Name
		System.out.println(t);
		
	}

}
