package com.kodnest.Private_DataMembers;

public class ParentChlidApp {
	public static void main(String[] args) {
		Child ch=new Child();
		System.out.println(ch.eyeColor);//Output will be "Blue" for this Statement
		System.out.println(ch.accountNumber);
		ch.displayParent();//Output will be "Inside Parent display" for this Statement
	}

}
