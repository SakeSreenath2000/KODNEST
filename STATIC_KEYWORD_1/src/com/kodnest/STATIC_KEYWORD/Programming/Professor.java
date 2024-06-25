package com.kodnest.STATIC_KEYWORD.Programming;

public class Professor {
	static String univName="VTU";//STATIC VARIABLES
	static int totalProf=0;//STATIC VARIABLES
	int profId;//NON-STATIC VARIABLES (or) INSTANCE VARIABLES
	String subject;//NON-STATIC VARIABLES (or) INSTANCE VARIABLES
	static //STATIC BLOCK
	{
		System.out.println("Welcome to "+univName);
	}
	{//NON-STATIC BLOCK (or) INSTANCE BLOCK
		totalProf +=1;
		profId=totalProf;
		System.out.println("Hiring a new Professor...");
	}
	public static int getTotalProf()//STATIC METHOD
	{
		return totalProf;
	}
	public void teach()//NON-STATIC METHOD
	{
		System.out.println("Professor ID: "+profId+ " is teaching "+subject);
	}
	public Professor(String subject)//CONSTRUCTOR
	{
		this.subject=subject;
	}
	public static void main(String[] args) //STATIC METHOD also called as MAIN METHOD
	{
		System.out.println("Total Professors at start: "+Professor.getTotalProf());
		System.out.println("-----------------------------------------");
		Professor prof1=new Professor("Java");
		prof1.teach();
		Professor prof2=new Professor("SQL");
		prof2.teach();
		System.out.println("-----------------------------------------");
		System.out.println("Total professors now: "+Professor.getTotalProf());
	}

}
