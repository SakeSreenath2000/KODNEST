package com.kodnest.ConstructorChainingUsingThisMethod;

public class Developer {
	String ProjectName;
	String tech;
	public Developer()
	{
		this("Instagram");
	}
	public Developer(String ProjectName) 
	{
		this("FaceBook","JavaTech");
		this.ProjectName=ProjectName;
	}
	public Developer(String ProjectName,String tech)
	{
		this.ProjectName=ProjectName;
		this.tech=tech;
	}
	

}
