package com.kodnest.Table_ObjectCreation.Programming;

public class Table {
	//"Properties" (or) "the object has part" and it will be handled by DataTypes
	//Also known as "Attributes" (or) DataMembers
	int seatingCapacity;
	int cost;
	String color;
	String brand;
	//"Behavior of the does part" (or) "the object does part" and it will handled by Methods 
	//Also known as "Functionalities" (or) MemberFunctions
	void allowToSit() {
		System.out.println("User can sit on the Table which is "+color+" color");
	}
	void allowToWrite() {
		System.out.println("User can write in the book by keeping it on the Table which is cost of "+cost);
	}
	
}
